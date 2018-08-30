package com.spring.repository;

import com.spring.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    public Customer get() {
        System.out.println("Ïnside get of Customer Repository");
        return new Customer();
    }
}
