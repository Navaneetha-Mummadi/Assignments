package myjavaservlet;

import java.sql.*;
import java.util.*;

public class BookDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/bookstore";
    private String jdbcUsername = "root";
    private String jdbcPassword = "password@1";

    private static final String INSERT_BOOKS_SQL = "INSERT INTO books (title, author, price) VALUES (?, ?, ?);";
    private static final String SELECT_BOOK_BY_ID = "SELECT * FROM books WHERE id = ?";
    private static final String SELECT_ALL_BOOKS = "SELECT * FROM books";
    private static final String DELETE_BOOKS_SQL = "DELETE FROM books WHERE id = ?";
    private static final String UPDATE_BOOKS_SQL = "UPDATE books SET title = ?, author = ?, price = ? WHERE id = ?;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertBook(Book book) throws SQLException {
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(INSERT_BOOKS_SQL)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setFloat(3, book.getPrice());
            stmt.executeUpdate();
        }
    }

    public Book selectBook(int id) {
        Book book = null;
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(SELECT_BOOK_BY_ID)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                book = new Book(id, rs.getString("title"), rs.getString("author"), rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public List<Book> selectAllBooks() {
        List<Book> books = new ArrayList<>();
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(SELECT_ALL_BOOKS)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                books.add(new Book(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getFloat("price")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public boolean deleteBook(int id) throws SQLException {
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(DELETE_BOOKS_SQL)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean updateBook(Book book) throws SQLException {
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(UPDATE_BOOKS_SQL)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setFloat(3, book.getPrice());
            stmt.setInt(4, book.getId());
            return stmt.executeUpdate() > 0;
        }
    }
}
