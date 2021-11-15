package application.controller;

import application.model.Citizen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CitizenController {
    @GetMapping("")
    public String showForm(Model model){
        String[] gender = new String[] {"Nam", "Nữ"};
        String[] national = new String[] {"Viet Nam", "Dai Loan", "Denmark", "USA", "England","China", "Thai Lan"};
        String[] vehicle = new String[] {"Tau Bay", "Tau Thuyen", "oto", "khac"};
        String[] cityName = new String[] {"Ho Chi Minh", "Ha Noi", "Da nang", "Quang Nam","Can tho"};
        String[] districtName = new String[] {"Hai Chau", "Son Tra", "Ngu Hanh son","Thanh Xuan", "Hoang Mai"," Binh Phuoc"};
        String[] wardsName = new String[] {"Binh Thuan","Hai An", "Phuoc My", "Tay Ho","Binh Chanh", "An Hai Bac"};

        model.addAttribute("gender", gender);
        model.addAttribute("national",national);
        model.addAttribute("citizen", new Citizen());
        model.addAttribute("vehicle",vehicle);
        model.addAttribute("cityName", cityName );
        model.addAttribute("districtName", districtName);
        model.addAttribute("wardsName",wardsName);
        return "form";
    }

    @PostMapping("/result")
    public String info(@ModelAttribute ("citizen") Citizen citizen, Model model){
        model.addAttribute("citizen",citizen);
        return "info";
    }
}
