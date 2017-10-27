package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@SpringBootApplication
public class Spring5BootJparestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5BootJparestApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		Customer customer = new Customer("Rajmohan","3600 Windhaven Parkway, Lewisville TX, 75056");
		customerDao.save(customer);
		
		customer = new Customer("Bill","343 Mount Hood Road, Seattle WA, 62466");
		customerDao.save(customer);
	
	}
	
	@Autowired
	CustomerDao customerDao;
}
