package repository.impl;

import bean.Book;
import bean.BookCard;
import bean.Student;
import repository.ConnectionSQL;
import repository.IBookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    private static final String SELECT_ALL = "select * from book;";
    @Override
    public List<Book> showList() {
        List<Book> bookList = new ArrayList<>();

        try {
            Connection connectionSQL = new ConnectionSQL().getConnection();
            PreparedStatement statement = connectionSQL.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id_book");
                String bookName = resultSet.getString("book_name");
                String author = resultSet.getString("author");
                String description  = resultSet.getString("description") ;
                String numberOfBook = resultSet.getString("number_of_book");

                bookList.add(new Book(id, bookName, author, description,numberOfBook));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionSQL.close();
        }
        return bookList;
    }

    @Override
    public List<BookCard> showBookCard() {
        return null;
    }

    @Override
    public List<Student> showStudent() {
        return null;
    }

    @Override
    public void insert(BookCard bookCard) {

    }

//    @Override
//    public void insert(Product product) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public boolean update(Product product) {
//        return false;
//    }
//
//    @Override
//    public Product findById(int id) {
//        return null;
//    }
//
//    @Override
//    public List<Product> findProduct(String productName) {
//        return null;
//    }


}