package com.arquitecturajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PruebaJDBCParametrizado {

	public static void main(String[] args) {
		
		
		ConfiguradorDB c = ConfiguradorDB.getInstance();
		
	
		try (Connection con = DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPassword());
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql)) {
			
			
		}
		
		

	}

}
