package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.service.customer.CustomerService;
import com.example.demo.service.customer_type.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CyclicBarrier;

@RestController
@CrossOrigin(originPatterns = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("api/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping()
    public ResponseEntity<Iterable<Customer>> showCustomer(){
        List<Customer> customers = (List<Customer>) customerService.findAll();
        if(customers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
//
//    @GetMapping()
//    public ResponseEntity<?> showCustomer(@PageableDefault(sort = "id", direction = Sort.Direction.ASC)  Pageable pageable){
//        Page<Customer> customersPage = customerService.findCustomerPage(pageable);
//        if(customersPage.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//
//        return new ResponseEntity<>(customersPage, HttpStatus.OK);
//    }



    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable long id){
        Optional<Customer> customerOptional = customerService.findById(id);
        if(!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }

    @GetMapping("customerPhone/{phone}")
    public ResponseEntity<Customer> findCustomerByPhone(@PathVariable("phone") String phone){
        Optional<Customer> customerOptional = customerService.findCustomerByCustomerPhone(phone);
        if(!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable long id, @RequestBody Customer customer){
        Optional<Customer> customerOptional = customerService.findById(id);
        if(!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customer.setId(customerOptional.get().getId());
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable long id){
        Optional<Customer> customerOptional = customerService.findById(id);
        if(!customerOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.NO_CONTENT);
    }

}
