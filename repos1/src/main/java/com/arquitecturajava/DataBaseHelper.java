package com.arquitecturajava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper {

	
	public void actualizar(String sql) {

		ConfiguradorDB c = ConfiguradorDB.getInstance();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();) {
			s.executeUpdate(sql);

		} catch (SQLException e) {

			System.out.println("logficheroSQL");
			e.printStackTrace();
			System.out.println("logficheroSQL");
			throw new RuntimeException(e);
		}
	}

	public static <T> List<T> seleccionar(String sql, Class<T> tipo) {

		String[] lista = null;
		String[] listaTiposColumna=null;
		
		ConfiguradorDB c = ConfiguradorDB.getInstance();
		List<T> listaObjetos = new ArrayList<T>();
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql)) {

			ResultSetMetaData rsmd = rs.getMetaData();
			int filas = rsmd.getColumnCount();
			lista = new String[filas];
			listaTiposColumna= new String[filas];

			for (int i=0;i<lista.length;i++) {
				
				lista[i]=rsmd.getColumnName(i+1);
				listaTiposColumna[i]=rsmd.getColumnTypeName(i+1);
				
			}
		

			while (rs.next()) {

				Class<T> clazz = (Class<T>) Class.forName(tipo.getName());
				Constructor<?> ctor = clazz.getConstructor();
				T objetoGenerico = (T) ctor.newInstance(new Object[] {});

				/*
				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[0], rs.getString(lista[0]));
				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[1], rs.getString(lista[1]));
				ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[2], rs.getInt(lista[2]));
				*/
				for (int i=0;i<lista.length;i++) {
					
					if (listaTiposColumna[i].equals("INT")) {
						ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[i], rs.getInt(lista[i]));
					
					}else if (listaTiposColumna[i].equals("VARCHAR"))
						
					ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[i], rs.getString(lista[i]));
					else {
						
						ReflectionHelper.cambiarPropiedad(objetoGenerico, lista[i], rs.getDouble(lista[i]));
						
					}
				}
				
				listaObjetos.add(objetoGenerico);
				

			}

		} catch (SQLException | ClassNotFoundException | NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return listaObjetos;
	}

}
