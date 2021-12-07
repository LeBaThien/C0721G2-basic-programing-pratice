package casestudy.demo.controller.employee_controller;



import casestudy.demo.model.employee.Division;
import casestudy.demo.model.employee.EducationDegree;
import casestudy.demo.model.employee.Employee;
import casestudy.demo.model.employee.Position;
import casestudy.demo.service.division.IDivisionService;
import casestudy.demo.service.education_degree.IEducationDegreeService;
import casestudy.demo.service.employee.IEmployeeService;
import casestudy.demo.service.position.IPositionService;
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
@Controller
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

//    @ModelAttribute("customer-type")
//    public Iterable<CustomerType> customerTypes(){
//        return customerTypeService.findAll();
//    }

//    @GetMapping("/search-by-phone")
//    public ModelAndView searchCustomersByPhone(@RequestParam("customerPhone") String phoneCustomer, Pageable pageable) {
//
//        Iterable<Customer> customers = customerService.findCustomerByCustomerPhone(phoneCustomer, pageable );
//        ModelAndView modelAndView = new ModelAndView("/customer/list");
//        modelAndView.addObject("customers", customers);
//        return modelAndView;
//    }
//
//
    @GetMapping("/create-employee")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        Iterable<Division> divisions = divisionService.findAll();
        Iterable<EducationDegree> educationDegrees = educationDegreeService.findAll();
        Iterable<Position> positions = positionService.findAll();

        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("divisions", divisions );
        modelAndView.addObject("educationDegrees", educationDegrees );
        modelAndView.addObject("positions", positions );
        return modelAndView;
    }

    @PostMapping("/create-employee")
//    Nên dùng string ,,, chứ ko dùng modelandview, dùng string giữ lại dữ liệu đang tạo mới,
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee,
                               BindingResult bindingResult,
                               Model model) {
//        new Employee().validate(employee, bindingResult);
//        if(bindingResult.hasFieldErrors()){
//            Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//            model.addAttribute("customerType", customerTypes );
//            return "customer/create";
//
//        } else {
            employeeService.save(employee);
//        ModelAndView modelAndView = new ModelAndView("/customer/create");
//        dùng redirect chổ này nó có thể tạo liên tục được
//            ModelAndView modelAndView = new ModelAndView("customer/create");
            model.addAttribute("employee", new Employee());
            model.addAttribute("message", "New employee created successfully !!!");
            return "employee/create";
//        }

    }

    @GetMapping("/employees")
    public String listEmployees(Optional<Employee> employee,
//                                Optional<String> phone,
                                Model model,
                                @PageableDefault(size=7)Pageable pageable
    ) {
        if(employee.isPresent()){
            model.addAttribute("employees", employeeService.findAllEmployee(pageable));

        }
//        else {
//
//        }
        return "/employee/list";
    }




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
//    @GetMapping("/delete-customer/{id}")
//    public ModelAndView showDeleteForm(@PathVariable int id) {
//        Optional<Customer> customer = customerService.findById(id);
//        Iterable<CustomerType> customerTypes = customerTypeService.findAll();
//        if (customer.isPresent()) {
//            ModelAndView modelAndView = new ModelAndView("/customer/delete");
//            modelAndView.addObject("customer", customer.get());
//            modelAndView.addObject("customerType", customerTypes );
//            return modelAndView;
//
//        } else {
//            ModelAndView modelAndView = new ModelAndView("/error.404");
//            return modelAndView;
//        }
//    }
//
//    @PostMapping("/delete-customer")
//    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
//        customerService.remove(customer.getCustomerId());
//        return "redirect:customers";
//    }

}
