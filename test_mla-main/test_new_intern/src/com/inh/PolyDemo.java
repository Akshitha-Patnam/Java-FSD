package com.inh;

class Parent1 // aadhar
{
	public void draw()
	{
		System.out.println("Square");
	}
}

class Child1 extends Parent1 // aadhar
{
	@Override
	public void draw()
	{
		System.out.println("Ciricle");
	}
}

class Child2 extends Parent1
{
	@Override
	public void draw()
	{
		System.out.println("Rectangle");
	}
}

public class PolyDemo {
	
	public static void main(String[] args) {
		
		Parent1 obj1 = new Child1();
		
		obj1.draw();
		
		Parent1 obj2 = new Child2();
		
		obj2.draw();
	}
}
