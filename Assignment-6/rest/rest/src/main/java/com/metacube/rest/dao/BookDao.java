package com.metacube.rest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacube.rest.factory.DBConnection;

/*
 * BookDao Class to write all required queries
 * @author Rahul
 */
public class BookDao {

	public static String insertBook(String title, String writer, String publisher, String publishedYear) {

		String query = "INSERT INTO books(title,writer,publisher,publishedYear) values(title, writer, publisher, publishedYear)";

		try {

			Connection connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			System.out.println(result);

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return "added succesfully";
	}

	/*
	 * to fetch all the books name already existing in library
	 */
	public static List<String> fetchAllBooks() {

		List<String> listOfBooks = new ArrayList<>();
		String query = "SELECT title FROM books;";

		try {
			Connection connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				listOfBooks.add(resultSet.getString("title"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfBooks;

	}

	// fetching a particular book record by using bookId
	public static String fetchBookById(int bookId) {

		String query = "SELECT title FROM books WHERE bookId = '" + bookId + "';";
		String book = null;

		try {
			Connection connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			resultSet.next();
			book = resultSet.getString("title");

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		return book != null ? book : "corrsponding book is not there";
	}

	// deleting a particular book record by using bookId
	public static void deleteBookById(int bookId) {

		String query = "DELETE FROM books WHERE bookId = '" + bookId + "';";

		try {
			Connection connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();
			boolean result = statement.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// deleting a all books
	public static void deleteAllBooks() {

		String query = "DELETE FROM books";

		try {
			Connection connection = DBConnection.connectDB();
			Statement statement = connection.createStatement();
			boolean result = statement.execute(query);
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}