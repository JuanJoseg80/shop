package poli.edu.co.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poli.edu.co.shop.percistence.entity.Customer;
import poli.edu.co.shop.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping ("/customer")
@RequiredArgsConstructor
public class CustomerController {


    private final CustomerService customerService;


    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }


}
