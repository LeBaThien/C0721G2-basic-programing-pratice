package com.example.demo.controller;



import com.example.demo.model.Promotion;

import com.example.demo.service.showtime.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller()
public class PromotionController {
    @Autowired
    private IPromotionService promotionService;

//    @Autowired
//    private IFilmService filmService;
//
//    @ModelAttribute("customer-type")
//    public Iterable<CustomerType> customerTypes(){
//        return customerTypeService.findAll();
//    }

//    @GetMapping("/search-by-film-name")
//    public ModelAndView searchCustomersByPhone(@RequestParam("filmName") String filmName, Pageable pageable) {
//
//        Iterable<Promotion> showtime = promotionService.findShowtimeByFilm_FilmName(filmName );
//        ModelAndView modelAndView = new ModelAndView("/showtime/list");
//        modelAndView.addObject("showtime", showtime);
//        return modelAndView;
//    }


//    @GetMapping("/create-showtime")
//    public ModelAndView showCreateForm() {
//        ModelAndView modelAndView = new ModelAndView("/showtime/create");
//        Iterable<Promotion> promotions = promotionService.findAll();
//        modelAndView.addObject("promotion", new Promotion());
//        modelAndView.addObject("promotion", promotions );
//        return modelAndView;
//    }

//    @PostMapping("/create-showtime")
////    Nên dùng string ,,, chứ ko dùng modelandview, dùng string giữ lại dữ liệu đang tạo mới,
//    public String saveShowtime(@Valid @ModelAttribute("showtime") Promotion showtime,
//                               BindingResult bindingResult,
//                               Model model) {
//        new Promotion().validate(showtime, bindingResult);
//        if(bindingResult.hasFieldErrors()){
//            if(showtimeService.existsDistinctByShowtimeCode(showtime.getShowtimeCode())){
//                model.addAttribute("message1", "Loi trung showtime code");
//            }
//            Iterable<Film> films = filmService.findAll();
//            model.addAttribute("film", films );
//            return "showtime/create";
//
//        } else {
//            showtimeService.save(showtime);
////        ModelAndView modelAndView = new ModelAndView("/customer/create");
////        dùng redirect chổ này nó có thể tạo liên tục được
////            ModelAndView modelAndView = new ModelAndView("customer/create");
//            model.addAttribute("showtime", new Promotion());
//            model.addAttribute("message", "New showtime created successfully !!!");
//            return "showtime/create";
//        }
//
//    }

    @GetMapping("/showtime")
    public String listCustomers(Optional<Promotion> showtime,
                                Optional<String> name,
                                Optional<Integer> customerTypeId,
                                Model model
//                                @PageableDefault(size=7)Pageable pageable
    ) {
//        if(!name.isPresent()){
////            model.addAttribute("customers", customerService.findAllCustomer(pageable));
////            model.addAttribute("countCustomer", customerService.countByCustomerId());
//
//            if(customerTypeId.isPresent()){
//                model.addAttribute("customers", customerService.findCustomerByCustomerTypeId(customerTypeId.get(),pageable));
//                model.addAttribute("customerTypeId", customerTypeId.get());
//            }else {
//                model.addAttribute("customers", customerService.findAllCustomer(pageable));
//            }
//        } else {
//            model.addAttribute("customers", customerService.findCustomerByCustomerPhone(name.get(),pageable));
//            model.addAttribute("customerPhone", phone.get());
//
//        }
        model.addAttribute("promotion", promotionService.findAll());
//        model.addAttribute("film", filmService.findAll());
        return "/promotion/list";
    }

//    @GetMapping("/index")
//    public ModelAndView list() {
////        Iterable<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/page/index");
////        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }


//    @GetMapping("/edit-showtime/{id}")
//    public ModelAndView showEditForm(@PathVariable int id) {
//        Optional<Promotion> showtime = showtimeService.findById(id);
//        Iterable<Film> films = filmService.findAll();
//        if (showtime.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/showtime/edit");
//            modelAndView.addObject("showtime", showtime.get());
//            modelAndView.addObject("film", films );
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
////
//    @PostMapping("/edit-showtime")
//    public String updateShowtime(@Valid @ModelAttribute("showtime") Promotion showtime,
//                                 BindingResult bindingResult, Model model ) {
////        new Customer().validate(customer, bindingResult);
////        if(bindingResult.hasFieldErrors()){
//////            Thêm cái này thì nếu load lại trang sẽ kèm dữ liệu, loại khách hàng, nên sẽ ko mất
////            Iterable<CustomerType> customerTypes = customerTypeService.findAll();
////            model.addAttribute("customerType", customerTypes );
////            return "customer/edit";
////        }else {
//            showtimeService.save(showtime);
////            ModelAndView modelAndView = new ModelAndView("/customer/edit");
//            model.addAttribute("showtime", showtime);
//            model.addAttribute("message", "Showtime updated successfully");
//            return "showtime/edit";
////        }
//
//    }
//
//    @GetMapping("/delete-showtime/{id}")
//    public ModelAndView showDeleteForm(@PathVariable int id) {
//        Optional<Promotion> showtime = showtimeService.findById(id);
//        Iterable<Film> films = filmService.findAll();
//        if (showtime.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/showtime/delete");
//            modelAndView.addObject("showtime", showtime.get());
//            modelAndView.addObject("film", films );
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
////
//    @PostMapping("/delete-showtime")
//    public String deleteShowtime(@ModelAttribute("showtime") Promotion showtime) {
//        showtimeService.remove(showtime.getId());
//        return "redirect:showtime";
//    }

}
