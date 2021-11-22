package form_register.demo.controller;

import form_register.demo.model.User;
import form_register.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @PostMapping("")
    public String checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "form";
        }
        return "/list";
    }
}
