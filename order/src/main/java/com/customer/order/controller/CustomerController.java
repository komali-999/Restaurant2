package com.customer.order.controller;


import com.customer.order.model.CustomerDetails;
import com.customer.order.repository.CustomerRepository;
import com.customer.order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FoodReservation")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

   // @PostMapping("/customer")
//    public CustomerDetails  CustomerDetails(@RequestBody CustomerDetails customerDetails) {
//        CustomerDetails valid = customerRepository.createUserDetails(customerDetails);
//        return valid;
//    }
}

