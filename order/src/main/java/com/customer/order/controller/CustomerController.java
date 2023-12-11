package com.customer.order.controller;


import com.customer.order.model.CustomerDetails;
import com.customer.order.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FoodReservation")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity CustomerDetails(@RequestBody CustomerDetails customerDetails) {
        ResponseEntity valid = customerService.createUserDetails(customerDetails);
        return valid;

    }
}

