package com.example.springbootjpa.service;

import com.example.springbootjpa.Modal.Customer;
import com.example.springbootjpa.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    //adding customer
    public Customer addCustomer(Customer customer){
        customerRepo.save(customer);
        return customer;
    }

    //read-all
    public List<Customer> getAllBook(){
        return (List<Customer>) customerRepo.findAll();
    }

}
