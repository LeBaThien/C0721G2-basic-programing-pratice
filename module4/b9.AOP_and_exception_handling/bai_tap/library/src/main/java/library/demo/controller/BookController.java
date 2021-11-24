package library.demo.controller;


import library.demo.model.Book;
import library.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ModelAndView showList(Optional<String> s, Pageable pageInfo)  {
       List<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("books",books);
        return modelAndView;
    }

    @PostMapping
//    @ModelAttribute("author")
    public ModelAndView searchByNameAuthor( @RequestParam("author") String name ){
        List<Book> books = bookService.findBooksByAuthor(name);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("books",books);
        return modelAndView;
    }

}
