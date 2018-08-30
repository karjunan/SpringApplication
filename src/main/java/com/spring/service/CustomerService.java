package com.spring.service;

import com.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {

//    @Autowired
    CustomerRepository customerRepository;

//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Using setter Injection");
        this.customerRepository = customerRepository;
    }

    public CustomerService() {
    }

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        System.out.println("We are using constuctor injections");
        this.customerRepository = customerRepository;
    }

    public void get() {
        customerRepository.get();
        System.out.println("Hello get");
    }

}
