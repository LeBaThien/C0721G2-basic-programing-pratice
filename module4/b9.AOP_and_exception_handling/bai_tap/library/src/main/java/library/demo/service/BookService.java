package library.demo.service;


import library.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> findAll();
    List<Book> findBooksByAuthor(String name);
}
