package com.test;

class Customer
{
	public Customer()
	{
		System.out.println("constructor");//5
	}
	
	{
		System.out.println("instance block");//4
	}
	
	static
	{
		System.out.println("static block");//3
	}
}

public class BlocksDemo {
	
	public BlocksDemo()
	{
		System.out.println("BlocksDemo");//7
	}
	
	{
		System.out.println("instance block");//6
	}
	
	static
	{
		System.out.println("static block");//1
	}
	
	public static void main(String[] args) {
		
		System.out.println("from main()");//2
		
		Customer obj = new Customer();
			
	}

}
