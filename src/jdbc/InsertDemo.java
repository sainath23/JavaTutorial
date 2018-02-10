package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			statement = connection.createStatement();
			String query = "INSERT INTO employees(first_name, last_name, email) VALUES('ABC', 'ABC', 'ABC@gmail.com')";
			statement.executeUpdate(query);
			System.out.println("RECORD HAS BEEN INSERTED!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement != null) {
					statement.close();
					connection.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
