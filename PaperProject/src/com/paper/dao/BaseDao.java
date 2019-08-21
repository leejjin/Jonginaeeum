package com.paper.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao implements Dao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@172.30.1.10:1521:xe";
	String user = "hr";
	String password = "1234";

	@Override
	public Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
//			System.out.println("Jdbc connection : " + connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		return connection;
	}
	
	public void closeDBObjects(ResultSet resultSet, Statement statement, Connection connection) {
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
