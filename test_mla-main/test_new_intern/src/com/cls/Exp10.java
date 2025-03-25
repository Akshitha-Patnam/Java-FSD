package com.cls;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exp10 {
	
	public static void main(String[] args) {
		
		List<Customer> cstList = new ArrayList<>();
		
		cstList.add(new Customer(5, "Rahul", "Pune"));
		cstList.add(new Customer(3, "Kohli", "Banglore"));
		cstList.add(new Customer(1, "Rohit", "Mumbai"));
		cstList.add(new Customer(2, "Dhoni", "Chennai"));
		cstList.add(new Customer(4, "Pant", "Delhi"));
		cstList.add(new Customer(5, "Rahul", "Pune"));
		cstList.add(new Customer(3, "Kohli", "Banglore"));
		cstList.add(new Customer(1, "Rohit", "Mumbai"));
		cstList.add(new Customer(2, "Dhoni", "Chennai"));
		cstList.add(new Customer(4, "Pant", "Delhi"));
		
		List<String> names =
		cstList.stream()
		.filter(x -> x.getName().length() >= 5)
		.map(emp -> emp.getName()).toList();
		
		
		names.stream().distinct().forEach(x -> System.out.println(x));
		
		System.out.println(cstList.stream()
		.filter(x -> x.getName().length() >= 5).count());
		
		
	}
}
