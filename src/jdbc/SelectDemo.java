package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Getting db connection
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			
			// Create statemente
			statement = connection.createStatement();
			
			// Sql query
			String query = "SELECT * FROM employees";
			
			// Execute sql query and store it in result set
			ResultSet resultSet = statement.executeQuery(query);
			
			// Display result
			System.out.println("ID\tFIRST_NAME\tLAST_NAME\tEMAIL");
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("first_name") + 
									"\t" + resultSet.getString("last_name") +
									"\t" + resultSet.getString("email"));
			}
			
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
