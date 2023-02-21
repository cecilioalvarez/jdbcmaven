package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaJDBCParametrizado {

	public static void main(String[] args) {

		ConfiguradorDB c = ConfiguradorDB.getInstance();

		String sql = "insert into Personas (nombre,apellidos,edad) values (?,?,?)";
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword())) {

			try (PreparedStatement s = con.prepareStatement(sql)) {
				con.setAutoCommit(false);
				s.setString(1, "blanca");
				s.setString(2, "sanchez");
				s.setInt(3, 20);

				s.execute();

				s.setString(1, "gema");
				s.setString(2, "gomez");
				s.setInt(3, 30);

				s.execute();
			
			} catch (SQLException e) {

				con.rollback();
				System.err.println(e.getMessage());

			}
			con.commit();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
