package com.inh;

class A
{
	int id = 101;
	String name = "Rohit";
	
	public void userDetails()
	{
		System.out.println("ID : "+id+" Name : "+name);
	}
}

class B extends A
{
	String city = "Chennai";
	
	public void stdInfo()
	{
		System.out.println("ID : "+id+" Name  : "+name+" City : "+city);
	}
}

public class SingleDemo {
	
	public static void main(String[] args) {
		
		B obj = new B();
		
		obj.stdInfo();
		obj.userDetails();
	}

}
