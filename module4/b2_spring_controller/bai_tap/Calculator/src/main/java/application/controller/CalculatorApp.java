package application.controller;

import org.springframework.expression.EvaluationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

@Controller
public class CalculatorApp {
    @GetMapping(value = "")
    public String showForm(){
        return "index";
    }

    @PostMapping(value ="")
    public String showResult(Model model, @RequestParam (value = "number1") int number1,
                             @RequestParam (value = "number2") int number2, @RequestParam(value="signal") String signal){
        int result;
        switch (signal) {
            case "+" :
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1/number2;
                break;
            default:
                result = 0;
        }
        model.addAttribute("result",result);

        return "result";
    }
}
