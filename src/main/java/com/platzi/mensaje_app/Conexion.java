package com.platzi.mensaje_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	String url = "jdbc:mysql://localhost:3306/mensajes_app";
	String user = "root";
	String password = "";
	
	public Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			System.out.println(e);
		} 
		return conn;
	}
}
