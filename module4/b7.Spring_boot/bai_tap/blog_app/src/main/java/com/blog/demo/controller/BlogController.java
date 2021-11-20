package com.blog.demo.controller;


import com.blog.demo.model.Blog;
import com.blog.demo.model.ECommerce;
import com.blog.demo.repository.ECommerceRepository;

import com.blog.demo.service.blog.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    ECommerceRepository eCommerceRepository;

    @ModelAttribute("ecommerce")
    public Iterable<ECommerce> eCommerces(){
        return eCommerceRepository.findAll();
    }

//day la duong dan url
    @GetMapping("blogs")
    public String showBlog(Optional<String> author,
                           Optional<Integer> eCommerceId,
                           Model model,
                           @PageableDefault(size = 7) Pageable pageable){
       if(!author.isPresent()){
           if(eCommerceId.isPresent()){
               model.addAttribute("blogs", blogService.findAllBlogECommerceId(eCommerceId.get(), pageable));
               model.addAttribute("eCommerceId", eCommerceId.get());
           }else {
               model.addAttribute("blogs", blogService.findAllBlog(pageable));
           }
       } else {
           model.addAttribute("blogs", blogService.findAllBlogByName(author.get(), pageable));
           model.addAttribute("author", author.get());
       }

       model.addAttribute("eCommerce",eCommerceRepository.findAll());
       return "blog/list";
//       day la duong dan thu muc
    }

    @GetMapping("/create/blog")
    public String showFormCreate(Model model){
        model.addAttribute("blogs",new Blog());
        return "blog/create";
    }


//    @PostMapping("create/blog")
//    public String createBlog(){
//
//    }
}
