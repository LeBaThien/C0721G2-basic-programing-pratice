package casestudy.demo.controller.customer_controller;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.model.customer.CustomerType;
import casestudy.demo.service.customer.ICustomerService;
import casestudy.demo.service.customer_type.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerTypeController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @ModelAttribute("customer-type")
    public Iterable<CustomerType> customerTypes(){
        return customerTypeService.findAll();
    }


    @GetMapping("/create-customer-type")
    public ModelAndView showCreateFormCustomerType() {
        ModelAndView modelAndView = new ModelAndView("/customer_type/create");
//        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
        modelAndView.addObject("customerType", new CustomerType());
//        modelAndView.addObject("customerType", customerTypes );
        return modelAndView;
    }
//
    @PostMapping("/create-customer-type")
    public String saveCustomer(@ModelAttribute("customerType") CustomerType customerType, Model model) {
        customerTypeService.save(customerType);
//        ModelAndView modelAndView = new ModelAndView("/customer/create");
//        dùng redirect chổ này nó có thể tạo liên tục được
//        ModelAndView modelAndView = new ModelAndView("redirect:/create-customer-type");
        model.addAttribute("customerType", new CustomerType());
        model.addAttribute("message", "New customer Type created successfully !!!");
        return "customer_type/create";
    }

    @GetMapping("/show-customer-type")
    public String listCustomersType(Optional<Customer> customer,
                                Optional<Integer> customerTypeId,
                                Model model,
                                @PageableDefault(size=3)Pageable pageable
    ) {
        if(customer.isPresent()){
            model.addAttribute("customersType", customerTypeService.findAllCustomerType(pageable));

//            if(customerTypeId.isPresent()){
//                model.addAttribute("Customer", customerService.findAllCustomer(pageable));
//                model.addAttribute("customerTypeId", customerTypeId.get());
//            }else {
//                model.addAttribute("customers", customerService.findAllCustomer(pageable));
//            }
        }
        model.addAttribute("customersType", customerTypeService.findAllCustomerType(pageable));
//        Iterable<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/customer/list");
//        modelAndView.addObject("customers", customers);
        return "/customer_type/list";
    }

//    @GetMapping("/index")
//    public ModelAndView list() {
////        Iterable<Customer> customers = customerService.findAll();
//        ModelAndView modelAndView = new ModelAndView("/page/index");
////        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }


//    @GetMapping("/edit-customer/{id}")
//    public ModelAndView showEditForm(@PathVariable int id) {
//        Optional<Customer> customer = customerService.findById(id);
//        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//        if (customer.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/customer/edit");
//            modelAndView.addObject("customer", customer.get());
//            modelAndView.addObject("customerType", customerTypes );
//            return modelAndView;
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/edit-customer")
//    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
//        customerService.save(customer);
//        ModelAndView modelAndView = new ModelAndView("/customer/edit");
//        modelAndView.addObject("customer", customer);
//        modelAndView.addObject("message", "Customer updated successfully");
//        return modelAndView;
//    }
//
    @GetMapping("/delete-customer-type/{id}")
    public ModelAndView showDeleteFormCustomerType(@PathVariable int id) {
        Optional<CustomerType> customerType = customerTypeService.findById(id);
        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
        if (customerType.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer_type/delete");
            modelAndView.addObject("customerType", customerType.get());
//            modelAndView.addObject("customerType", customerTypes );
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
//
    @PostMapping("/delete-customer-type")
    public String deleteCustomer(@ModelAttribute("customerType") CustomerType customerType) {
        customerTypeService.remove(customerType.getCustomerTypeId());
        return "redirect:show-customer-type";
    }
}
