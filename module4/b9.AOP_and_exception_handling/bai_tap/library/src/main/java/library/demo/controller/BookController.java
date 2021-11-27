package library.demo.controller;


import library.demo.model.Book;
import library.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.BlockingDeque;

@Controller
//@RequestMapping("books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("books/list")
    public ModelAndView showList(Optional<String> s, Pageable pageInfo)  {
       Iterable<Book> books = bookService.findAll();
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("books",books);
        return modelAndView;
    }

    @PostMapping("search/author")
//    @ModelAttribute("author")
    public ModelAndView searchByNameAuthor( @RequestParam("author") String name ){
        List<Book> books = bookService.findBooksByAuthor(name);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("books",books);
        return modelAndView;
    }

    @GetMapping("books/create")
    public String showFromCreate(Model model){
        model.addAttribute("books", new Book());
        return "create";
    }

    @PostMapping("books/create-b")
//    tuong duong voi action ben html, neu ko ghi thi action ben kia ko neen dde,
//    neu ben nay de books/create, giong voi get, ben kia ko de thi mac dinh khi gui form
//    bang method post thi no se chay vao day
    public String create(@ModelAttribute("books") Book book,
                         Model model,
                         RedirectAttributes redirectAttributes){
        bookService.save(book);
        model.addAttribute( "books", new Book());
        redirectAttributes.addFlashAttribute("message","create successfully");
        return "redirect:/books/list";
    }

    @GetMapping("edit/book/{id}")
    public String showEditForm(@PathVariable int id, Model model){
        Optional book = bookService.findById(id);
        model.addAttribute("books", book);
        return "edit";
    }

    @GetMapping("delete/book/{id}")
    public String showDeleteForm(@PathVariable int id, Model model){
        Optional book = bookService.findById(id);
        model.addAttribute("books", book.get());
        return "/delete";
    }

    @PostMapping("delete/book")
    public String deleteBook(@PathVariable int id, Book book,
                             Model model){
        bookService.remove(id);
//        model.addAttribute("books", book);
        return "redirect:/books/list";
    }

}
