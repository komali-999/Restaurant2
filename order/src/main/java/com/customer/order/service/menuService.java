package com.customer.order.service;


import com.customer.order.model.menuDetails;
//import com.customer.order.repository.menuRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

//@Service
//public class menuService {
//    @Autowired
//    menuRepositor menuRepositor;
//    public ResponseEntity menu(menuDetails orderDetails){
//        orderDetails.setCreate_timestamp(Timestamp.valueOf(LocalDateTime.now()));
//        orderDetails.setDate(Date.valueOf(LocalDate.now()));
//        orderDetails.setId((new Random().nextInt(10000)));
//        menuRepositor.save(orderDetails);
//        return ResponseEntity.ok().body("Menu list is prepared");
//    }
//
//}
