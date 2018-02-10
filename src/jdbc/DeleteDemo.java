package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			statement = connection.createStatement();
			String query = "DELETE FROM employees WHERE id = 9";
			int rowsAffected = statement.executeUpdate(query);
			System.out.println("SUCCESSFULLY DELETED RECORD! " + rowsAffected);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
