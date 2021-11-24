package library.demo.repository;

import library.demo.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book,Integer> {
    List<Book> findAll();
    List<Book> findBooksByAuthor(String name);

}
