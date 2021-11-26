package com.blog.demo.controller;


import com.blog.demo.model.Blog;
import com.blog.demo.model.ECommerce;
import com.blog.demo.repository.ECommerceRepository;

import com.blog.demo.service.Ecommerce.ECommerceService;
import com.blog.demo.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.jws.WebParam;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/blogs")
public class BlogController {
    @Autowired
    BlogService blogService;

    //    @Qualifier("ECommerceService")
    @Autowired
    ECommerceService eCommerceService;

    @ModelAttribute("ecommerce")
    public Iterable<ECommerce> eCommerces() {
        return eCommerceService.findAll();
    }

    //day la duong dan url
    @GetMapping()
    public ResponseEntity<Iterable<Blog>> showBlog() {
        List<Blog> blogs = (List<Blog>) blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
//       if(!author.isPresent()){
//           if(eCommerceId.isPresent()){
//               model.addAttribute("blogs", blogService.findAllBlogECommerceId(eCommerceId.get(), pageable));
//               model.addAttribute("eCommerceId", eCommerceId.get());
//           }else {
//               model.addAttribute("blogs", blogService.findAllBlog(pageable));
//           }
//       } else {
//           model.addAttribute("blogs", blogService.findAllBlogByName(author.get(), pageable));
//           model.addAttribute("author", author.get());
//       }
//
//       model.addAttribute("eCommerce",eCommerceService.findAll());
//       return "blog/list";
//       day la duong dan thu muc
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

//    @GetMapping("/create/blog")
//    public String showFormCreate(Model model){
//        List<ECommerce> eCommerceList = eCommerceService.findAll();
//        model.addAttribute("blogs",new Blog());
//        model.addAttribute("eCommerceList",eCommerceList);
//        return "blog/create";
//    }


    //    @PostMapping("")
//    public String createBlog(@Valid @ModelAttribute("blogs") Blog blog,
//                             BindingResult bindingResult,
//                             Model model,
//                             RedirectAttributes redirectAttributes){
//        new Blog().validate(blog, bindingResult);
//        if(bindingResult.hasFieldErrors()){
//            return "/blog/create";
//        } else {
//
//            blogService.save(blog);
////        Khi dung cái này, nó đưa về trang create, tiếp tục create
//            model.addAttribute("blogs", new Blog());
////        casic redirect thì dùng casci này, về trang chủ kèm message
//            redirectAttributes.addFlashAttribute("message", "create successfully!!!");
//            return "redirect:/blogs";
//        }
//
//    }
    @GetMapping("/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable int id) {
        Optional<Blog> blogOptional = blogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Blog> saveBlogs(@RequestBody Blog blog) {
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id,
                                           @RequestBody Blog blog) {
        Optional<Blog> blogOptional = blogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        return new ResponseEntity<>(blogService.save(blog), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable int id) {
        Optional<Blog> blogOptional = blogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.NO_CONTENT);
    }
}
