package com.example.SpringBootH2Demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class HelloWorldController {

    @Autowired
    CustomerRepository customerRepository;

     @PostMapping("/customer")
    public void insertCustomers(){
        Customer customer= new Customer("Neha","Garg");
        customerRepository.save(customer);
    }

    @GetMapping("/hello")
    public String hello(){
    Iterable<Customer> iterable= customerRepository.findAll();
    List<Customer> result = new ArrayList<Customer>();
    iterable.forEach(result::add);
        return result.toString();
    }

    @GetMapping("/customers")
    List<Customer> all() {
    return customerRepository.findAll();
  }

  @PostMapping("/newcustomer")
  Customer newCustomer(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }
}
