package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long> {

	List<Customer> findAll();

	Customer findByName(String name);

}
