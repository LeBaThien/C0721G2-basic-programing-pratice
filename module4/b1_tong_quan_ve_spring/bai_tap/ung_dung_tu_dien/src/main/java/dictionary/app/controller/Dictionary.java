package dictionary.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("")
    public String showFormInput() {
        return "index";

        }

    @PostMapping("")
    public String exchangeWord(@RequestParam String englishWord, Model model) {
        String[] wordList1 = {"Mot", "Hai", "Mau Xanh", "Mau Đen", "Mau Tim"};
        String[] wordList2 = {"one", "two", "green", "black", "purple"};
        String result = "";

            for (int j = 0; j < wordList2.length; j++) {
                if (englishWord.equals(wordList2[j])) {
                    result = wordList1[j];
                        break;
                } else {
                    result = "not found";

                }
            }
        model.addAttribute("result", result);
        return "index";
    }
}
