package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaJDBCParametrizadoTransaccion {

	public static void main(String[] args) {

		ConfiguradorDB c = ConfiguradorDB.getInstance();

		String sql = "insert into Personas (nombre,apellidos,edad) values (?,?,?)";
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				PreparedStatement s = con.prepareStatement(sql)) {
				s.setString(1, "david");
				s.setString(2, "sanchez");
				s.setInt(3, 20);
				s.execute();
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
		
}
