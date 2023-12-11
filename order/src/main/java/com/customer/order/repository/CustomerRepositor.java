package com.customer.order.repository;

import com.customer.order.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositor extends JpaRepository<CustomerDetails,Integer> {
}
