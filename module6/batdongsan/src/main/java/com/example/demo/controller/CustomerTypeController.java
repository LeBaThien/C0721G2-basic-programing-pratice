package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerType;
import com.example.demo.service.customer_type.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(originPatterns = "http://localhost:4200")
@RequestMapping("api/customerTypes")
public class CustomerTypeController {
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping()
    public ResponseEntity<Iterable<CustomerType>> showCustomerType() {
        List<CustomerType> customerTypes = (List<CustomerType>) customerTypeService.findAll();
        if (customerTypes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customerTypes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerType> findCustomerTypeById(@PathVariable long id){
        Optional<CustomerType> customerTypeOptional = customerTypeService.findById(id);
        if(!customerTypeOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerTypeOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerType> saveCustomerType(@RequestBody CustomerType customerType){
        return new ResponseEntity<>(customerTypeService.save(customerType), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerType> updateCustomerType(@PathVariable long id, @RequestBody CustomerType customerType){
        Optional<CustomerType> customerTypeOptional = customerTypeService.findById(id);
        if(!customerTypeOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerType.setId(customerTypeOptional.get().getId());
        return new ResponseEntity<>(customerTypeService.save(customerType), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerType> deleteCustomerType(@PathVariable long id){
        Optional<CustomerType> customerTypeOptional = customerTypeService.findById(id);
        if(!customerTypeOptional.isPresent()){
          return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerTypeService.remove(id);
        return new ResponseEntity<>(customerTypeOptional.get(), HttpStatus.NO_CONTENT);
    }

}
