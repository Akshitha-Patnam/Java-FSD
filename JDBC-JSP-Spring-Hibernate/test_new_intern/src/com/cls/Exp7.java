package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//using comparable and comparator sorting the data based on id,name, and age
//comparable from java.lang.*; package it is functional interface 
// public int compareTo(Object o);

class Customer //implements Comparable<Customer>
{
	private int id;
	
	private String name;
	
	private String city;

	public Customer()
	{
		
	}
	
	public Customer(int id, String name, String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
   /*
	@Override
	public int compareTo(Customer o) {
		
		return this.id-o.id;
	}
	*/
	
}

public class Exp7 {
	
	public static void main(String[] args) {
		
		List<Customer> cstList = new ArrayList<>();
		
		cstList.add(new Customer(5, "Rahul", "Pune"));
		cstList.add(new Customer(3, "Kohli", "Banglore"));
		cstList.add(new Customer(1, "Rohit", "Mumbai"));
		cstList.add(new Customer(2, "Dhoni", "Chennai"));
		cstList.add(new Customer(4, "Pant", "Delhi"));
		
		//Collections.sort(cstList);
		
		cstList.forEach(cst -> System.out.println(cst.getId()+" "+cst.getName()+" "+cst.getCity()));
	
		//USING STRAM API PRINT NAMES WITH FILTER METHOD STARTS WITH CHARS
		
		cstList.stream()
		.filter(cst -> cst.getName().startsWith("R"))
		.forEach(dt -> System.out.println(dt));
		
		//using stream API sorting the customer data
		
		cstList.stream()
		.sorted(Comparator.comparing(Customer :: getName ))
		.forEach(cst -> System.out.println(cst.getId()+" "+cst.getName()+" "+cst.getCity()
		));
		
		//create new list and store formated data 
		
		List<Customer> frmtData = 
								cstList.stream()
								.sorted(Comparator.comparing(Customer :: getName))
								.collect(Collectors.toList());
		frmtData
		.forEach(cst -> System.out.println(cst.getId()+" "+cst.getName()+" "+cst.getCity()));
	}
}
