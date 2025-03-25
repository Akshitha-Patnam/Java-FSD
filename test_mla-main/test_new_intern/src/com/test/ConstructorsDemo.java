package com.test;

class Employee
{
	public Employee()
	{
		System.out.println("Default constructor.");
	}
	
	public Employee(int x, String str)
	{
		System.out.println("parameterised constructor");
	}
	
	public Employee(Employee obj)
	{
		System.out.println("object parameterised constructor");
	}
	
	//factory method
	public Employee getObj(Employee emp)
	{
		if(emp == null)
		{
			emp = new Employee();
		}
		System.out.println("object created.");
		return emp;
	}
	
	public static Employee getInstance()
	{
		return new Employee();
	}
	
	public int add()
	{
		return 100;
	}

	
}

public class ConstructorsDemo {
	
	public static void main(String[] args) {
		
		
		
		Employee obj4 = Employee.getInstance();
		
		int x = obj4.add();
		
		System.out.println(obj4.hashCode());
		
		
		
	}
}

//what is the default super class for the all the classes 
//java.lang.Object

/*
 * 1. by using new operator or constructor
 * 2. using factory method
 * 3. using clone()
 * 4. Class.forName()
 */
