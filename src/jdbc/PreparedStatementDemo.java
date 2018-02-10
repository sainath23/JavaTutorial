package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			String query = "SELECT * FROM employees WHERE email like ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "%yahoo%");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println("Name: " + resultSet.getString("first_name") + " Email: " + resultSet.getString("email"));
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
