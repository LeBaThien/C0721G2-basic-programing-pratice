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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.jws.WebParam;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

//    @Qualifier("ECommerceService")
    @Autowired
    ECommerceService eCommerceService;

    @ModelAttribute("ecommerce")
    public Iterable<ECommerce> eCommerces(){
        return eCommerceService.findAll();
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

       model.addAttribute("eCommerce",eCommerceService.findAll());
       return "blog/list";
//       day la duong dan thu muc
    }

    @GetMapping("/create/blog")
    public String showFormCreate(Model model){
        List<ECommerce> eCommerceList = eCommerceService.findAll();
        model.addAttribute("blogs",new Blog());
        model.addAttribute("eCommerceList",eCommerceList);
        return "blog/create";
    }


    @PostMapping("create/blog")
    public String createBlog(@ModelAttribute("blog") Blog blog, Model model, RedirectAttributes redirectAttributes){
        blogService.save(blog);
//        Khi dung cái này, nó đưa về trang create, tiếp tục create

        model.addAttribute("blogs", new Blog());
//        casic redirect thì dùng casci này, về trang chủ kèm message
        redirectAttributes.addFlashAttribute("message", "create successfully!!!");
        return "redirect:/blogs";

    }

    @GetMapping("edit/blog/{id}")
    public ModelAndView showEditBlogForm(@PathVariable int id, Model model){
        Blog blog = blogService.findBlogById(id);
        List<ECommerce> eCommerceList = eCommerceService.findAll();
        ModelAndView modelAndView = new ModelAndView("blog/edit");
//        modelAndView.addObject("blogs", blog.get());
//        Mai hỏi
        model.addAttribute("blogs", blog);
        model.addAttribute("eCommerceList", eCommerceList);

        return modelAndView;
    }

    @PostMapping("/edit/blog")
    public ModelAndView updateBlog(@ModelAttribute("blogs") Blog blog, RedirectAttributes redirectAttributes){
         blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
//        modelAndView.addObject("blogs", blog);
        modelAndView.addObject("message","update successfully!!!");
//        redirectAttributes.addFlashAttribute("message","update successfully!!!");
        return modelAndView;
    }
}
