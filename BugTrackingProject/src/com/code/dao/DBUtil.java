
//Author : Adrija Ghansiyal
//Purpose : Database connection

package com.code.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	
	//Establishing connection
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			
			String url = "jdbc:derby:C:\\bugtrackproject\\bugtrackdb";
	        String user = "hsbc";
	        String password = "hsbc123";
	        
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
		           System.out.println("Connected to database ");
		    }
			} catch (SQLException e) {
				System.out.println("Connection not done derby ");
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	

	//closing connection
	public static void closeMyConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
