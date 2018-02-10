package com.sainath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionDemo {
	
	public static boolean askUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to save changes? yes or no? ");
		String answer = sc.nextLine();
		sc.close();
		if(answer.toLowerCase().equals("yes")) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USER, Constants.DB_PASSWORD);
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			String query = "UPDATE employees SET email = 'shahid.ansari@gmail.com' WHERE id = 7";
			statement.executeUpdate(query);
			boolean ok = askUser();
			
			if(ok) {
				connection.commit();
				System.out.println("Success!");
			}
			else {
				System.out.println("Failed!");
			}
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
