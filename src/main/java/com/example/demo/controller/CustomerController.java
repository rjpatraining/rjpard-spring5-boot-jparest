package com.example.demo.controller;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

	@Autowired
	CustomerDao customerDao;

	@RequestMapping("/customers/{name}")
	public @ResponseBody Customer hiThere(@PathVariable String name) {
		Customer customer = customerDao.findByName(name);
		return customer;
	}

	@RequestMapping("/customers")
	public @ResponseBody List<Customer> getAll() {
		List<Customer> customers = customerDao.findAll();
		return customers;
	}

}
