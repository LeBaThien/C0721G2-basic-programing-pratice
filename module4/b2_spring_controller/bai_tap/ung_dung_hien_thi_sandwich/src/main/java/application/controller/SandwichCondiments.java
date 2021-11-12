package application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondiments {
    @GetMapping(value = "")
    public String showMenu(){
        return "index";
    }

    @PostMapping(value="")
    public String showSelection(@RequestParam String name , Model model){
//        String result = name ;
        model.addAttribute("result",name);
        return "index";
    }
}
