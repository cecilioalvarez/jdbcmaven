package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PruebaJDBCParametrizado4 {

	public static void main(String[] args) {

		NiñoRepositoryJDBC repo= new NiñoRepositoryJDBC();
		List<NiñoDTO> lista= repo.buscarTodos();
		
		for (NiñoDTO dto:lista) {
			
			System.out.println(dto.getNombre());
			System.out.println(dto.getEdad());
			System.out.println(dto.getRegalo());
			System.out.println(dto.getPrecio());
		}
	}
}
