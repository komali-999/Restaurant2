package com.customer.order.service;

import com.customer.order.model.CustomerDetails;
import com.customer.order.repository.CustomerRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CustomerService {
    @Autowired
    CustomerRepositor customerRepositor;

    public ResponseEntity createUserDetails(CustomerDetails customerDetails){
        customerDetails.setId(String.valueOf(new Random().nextInt(10000)));
        customerRepositor.save(customerDetails);
        return ResponseEntity.ok().body("User Details Created");
    }

  //  public List<CustomerDetails> getUserDetailsByPhonumber(String phoneNumber){
  //      return  customerRepositor.findByPhoneNumber(phoneNumber);
 //



}
