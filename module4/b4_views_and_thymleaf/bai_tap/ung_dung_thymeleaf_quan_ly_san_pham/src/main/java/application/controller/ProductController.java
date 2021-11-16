package application.controller;


import application.model.Product;
import application.service.IProductService;
import application.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("")
    public String Index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("create")
    public String Create(Model model){
        model.addAttribute("products",  new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String Save(Product product){
        product.setProductId((int) (Math.random() *1000));
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{productId}/edit")
    public String Edit(@PathVariable int productId, Model model) {
        model.addAttribute("products",productService.findById(productId));
        return "/edit";
    }

    @PostMapping("/update")
    public String Update(Product product){
        productService.update(product.getProductId(),product);
        return "redirect:/product";
    }

    @GetMapping("/{productId}/delete")
    public String Delete(@PathVariable int productId, Model model){
        model.addAttribute("products",productService.findById(productId));
        return "/delete";
    }

    @PostMapping("/delete")
    public String Delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getProductId());
        redirect.addFlashAttribute("success","Removes product successfully!!1");
        return "redirect:/product";
    }

    @GetMapping("{productId}/view")
    public String View(@PathVariable int productId, Model model){
        model.addAttribute("products", productService.findById(productId));
        return "/view";
    }
}
