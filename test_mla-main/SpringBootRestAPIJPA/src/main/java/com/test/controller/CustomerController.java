package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {

	@Autowired
	private CustomerService service;
	

	public void setService(CustomerService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cst)
	{
		Customer cstData = service.creatCustomer(cst);
		
		return new ResponseEntity<>(cstData, HttpStatus.NO_CONTENT);
		
	}
	
	@GetMapping("/listall")
	public List<Customer> listAllCustomers()
	{
		return service.readAllCustomers();
	}
	
	@PutMapping("/update/{id}")
	public List<Customer> updteCustomer(@RequestBody Customer cst, @PathVariable("id") int id)
	{
		cst.setId(id);
		
		return service.updateCustomer(cst);
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Customer> deleteCustomer(@PathVariable("id") int id)
	{
		return service.deleteCustomer(id);
	}
}
