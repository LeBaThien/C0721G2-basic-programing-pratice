package application.controller;


import application.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailForm {
    @GetMapping("")
    public String showForm(Model model){
        String[] language = new String[] {"English","Vietnamese","Japanese","chinese"};
        String[] pageSize = new String[] {"5","10","15","20","25","100"};
        String[] spamsFilter = new String[] {"Yes","No"};
        String[] signature = new String[] {"Thỏ,//King"};
        model.addAttribute("language", language);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("spamsFilter",spamsFilter);
        model.addAttribute("signature", signature);
        model.addAttribute("Email",new Email());
        return "form";
    }

    @PostMapping("")
    public String create(@ModelAttribute ("email") Email email, Model model){
        model.addAttribute("email", email);
        return "showUpdate";
    }
}
