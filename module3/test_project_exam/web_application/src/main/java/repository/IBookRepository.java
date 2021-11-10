package repository;

import bean.Book;
import bean.BookCard;
import bean.Student;

import java.util.List;

public interface IBookRepository {
    List<Book> showList();
//    void insert(Product product);
//    void delete(int id);
//    boolean update(Product product);
//    Product findById (int id);
//    //    List<ProductType> showCustomerType();
//    List<Product> findProduct(String productName);
    List<BookCard> showBookCard();
    List<Student> showStudent();
    void insert (BookCard bookCard);
}
