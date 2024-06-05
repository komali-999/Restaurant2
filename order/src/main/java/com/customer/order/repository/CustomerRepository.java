package com.customer.order.repository;

import com.customer.order.config.DynamoDbConfigration;
import com.customer.order.model.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class CustomerRepository {
    @Autowired
    DynamoDbConfigration dynamoDbConfigration;

    public CustomerDetails createUserDetails(CustomerDetails customerDetails){
        dynamoDbConfigration.dynamoDBMapper().save(customerDetails);
        return customerDetails;
    }

}
