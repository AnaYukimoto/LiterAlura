package Service;

import Model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    private static final String URL = "jdbc:postgresql://localhost:5432/literalura";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    // Método para inserir um livro no banco de dados
    public void insertBook(Book book) throws SQLException {
        String query = "INSERT INTO books (title, author) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.executeUpdate();
        }
    }

    // Método para listar livros no banco de dados
    public List<Book> listBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        String query = "SELECT title, author FROM books";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Book book = new Book();
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                books.add(book);
            }
        }
        return books;
    }
}
