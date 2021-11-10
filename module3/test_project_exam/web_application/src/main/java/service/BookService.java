package service;

import bean.Book;
import bean.BookCard;
import bean.Student;

import java.util.List;

public interface BookService {
    List<Book> showList();
//    void insert(Product product);
//    void delete(int id);
//    boolean update(Product product);
//    Product findById (int id);
    List<BookCard> showBookCard();
    List<Student> showStudent();
    void insert (BookCard bookCard);
//    List<Product> findProduct(String productName);
}
