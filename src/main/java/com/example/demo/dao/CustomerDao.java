package com.example.demo.dao;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDao extends CrudRepository<Customer, Long> {

	List<Customer> findAll();

	Customer findByName(String name);

}
