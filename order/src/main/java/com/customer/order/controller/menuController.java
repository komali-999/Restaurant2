package com.customer.order.controller;


import com.customer.order.model.menuDetails;
import com.customer.order.service.menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FoodReservation")
public class menuController {
    @Autowired
    menuService menuService;
    @PostMapping("/Food")
    public ResponseEntity menulist(@RequestBody menuDetails orderDetails){
      ResponseEntity valid = menuService.menu(orderDetails);
        return valid ;
    }

}
