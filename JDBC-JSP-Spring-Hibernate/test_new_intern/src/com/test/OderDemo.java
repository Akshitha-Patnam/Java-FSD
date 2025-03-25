package com.test;

import java.util.Scanner;

//POJO : Plain Old Java Object
class Order
{
	private int id;
	
	private String name;
	
	private int price;
	
	private int qnty;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setQnty(int qnty)
	{
		this.qnty = qnty;
	}
	
	public int getQnty()
	{
		return qnty;
	}
}

public class OderDemo {
	
	public static void main(String[] args) {
		
		Order obj = new Order(); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		
		obj.setId(id);
		
		System.out.println("enter name");
		
		String name = sc.next();
		
		obj.setName(name);
		
		System.out.println("enter price");
		
		int price = sc.nextInt();
		
		obj.setPrice(price);
		
		System.out.println("enter quantity");
		
		int qnty = sc.nextInt();
		
		obj.setQnty(qnty);
		
        System.out.println("ID : "+obj.getId()+" Name : "+obj.getName()+" Price : "
                                  +obj.getPrice()+" Quantity : "+obj.getQnty());
	}
}
