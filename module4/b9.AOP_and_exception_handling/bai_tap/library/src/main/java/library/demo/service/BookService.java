package library.demo.service;


import library.demo.IGeneralService;
import library.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService extends IGeneralService<Book> {
//    List<Book> findAll();
    List<Book> findBooksByAuthor(String name);
}
