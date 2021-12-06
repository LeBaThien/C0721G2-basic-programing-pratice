package casestudy.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class UserController {
//    @GetMapping("/")
//    public ModelAndView index() {
//        return new ModelAndView("login/index");
//    }
//
//    @GetMapping("/user")
//    public ModelAndView user(Principal principal) {
//        // Get authenticated user name from Principal
//        System.out.println(principal.getName());
//        return new ModelAndView("login/index");
//    }
//
//    @GetMapping("/admin")
//    public ModelAndView admin() {
//        // Get authenticated user name from SecurityContext
//        SecurityContext context = SecurityContextHolder.getContext();
//        System.out.println(context.getAuthentication().getName());
//        return new ModelAndView("login/admin");
//    }
}
