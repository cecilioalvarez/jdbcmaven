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

		String sql = "select * from Personas where nombre= ?";
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				PreparedStatement s = con.prepareStatement(sql)) {
			inicializarParametros(s, "juan");
			try (ResultSet rs = s.executeQuery()) {

				while (rs.next()) {

					System.out.println(rs.getString("nombre"));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void inicializarParametros(PreparedStatement p, String campo) throws SQLException {
		p.setString(1, campo);
	}
}
