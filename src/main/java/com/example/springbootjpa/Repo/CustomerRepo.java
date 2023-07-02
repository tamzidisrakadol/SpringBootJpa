package com.example.springbootjpa.Repo;

import com.example.springbootjpa.Modal.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {

}
