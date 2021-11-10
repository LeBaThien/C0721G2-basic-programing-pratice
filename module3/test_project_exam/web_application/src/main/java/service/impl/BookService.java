package service.impl;

import bean.Book;
import bean.BookCard;
import bean.Student;
import repository.IBookRepository;
import repository.impl.BookRepository;

import java.util.List;

public class BookService implements service.BookService {
    IBookRepository iBookRepository = new BookRepository();
    @Override
    public List<Book> showList() {
        return iBookRepository.showList();
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


}
