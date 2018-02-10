package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			statement = connection.createStatement();
			String query = "UPDATE employees SET email = 'pratik.khadtale@gmail.com' WHERE id = 6";
			statement.executeUpdate(query);
			System.out.println("SUCCESSFULLY UPDATED RECORD!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
