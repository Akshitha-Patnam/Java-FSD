package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.CustDao;
import com.test.model.Customer;

public class StoreData {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer obj = new Customer();
		
		obj.setId(3);
		obj.setName("Rahul");
		obj.setType("Occass");
		
	CustDao cst =  ctx.getBean("custDao", CustDao.class);
		
	// cst.createCustomer(obj);	
	
	//cst.updateCustomer(obj);
	
	//cst.deleteCustomer(obj);
	
	List<Customer> data =  cst.getAllCustomers();
	
	for(Customer cstd : data)
	{
		System.out.println(cstd);
	} 
	 
	}
}
