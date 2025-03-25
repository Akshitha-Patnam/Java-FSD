package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerSericeImpl implements CustomerService
{
	
	@Autowired
	private CustomerDao customerDao;
	
	
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer creatCustomer(Customer cst) {
		
		
		
		return customerDao.createCustomer(cst);
	}

	@Override
	public List<Customer> readAllCustomers() {
		
		List<Customer> list = customerDao.readAllCustomers();
		
		if(list.size() < 0)
		{
			System.out.println("no content");
		}
		
		return list;
	}

	@Override
	public List<Customer> updateCustomer(Customer cst) {
		
		customerDao.updateCustomer(cst);
		
		
		return customerDao.readAllCustomers();
	}

	@Override
	public List<Customer> deleteCustomer(int id) {
		
		customerDao.deleteCustomer(id);
		
		
		return customerDao.readAllCustomers();
	}

}
