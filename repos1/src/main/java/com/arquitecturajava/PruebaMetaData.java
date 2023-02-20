package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class PruebaMetaData {

	public static void main(String[] args) {

		ConfiguradorDB c = ConfiguradorDB.getInstance();

		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("select * from Personas")) {

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnas = rsmd.getColumnCount();

			for (int i = 1; i <= columnas; i++) {

				System.out.print(rsmd.getColumnName(i) + "     ");

			}
			System.out.println("");

			while (rs.next()) {

				for (int i = 1; i <= columnas; i++) {

					System.out.print(rs.getString(i) + "     ");

				}
				
				System.out.println("");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
