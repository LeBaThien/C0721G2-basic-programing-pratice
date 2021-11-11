package exchange.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeMoneyController {
    @PostMapping("")
    public String exchange(@RequestParam int usd,@RequestParam int exchangeRate, Model model){
        int result = usd * exchangeRate;
        model.addAttribute("exchange",result);
        return "form_exchange";
    }

    @GetMapping("")
    public String showList (){
        return "form_exchange";
    }
}
