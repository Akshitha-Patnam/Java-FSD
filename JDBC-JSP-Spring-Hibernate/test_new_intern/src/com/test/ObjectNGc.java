package com.test;

class Book
{
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("object is going to garbage collection");
	}
	
	public static Book getInstance()
	{
		return new Book();
	}
	
	public void disp()
	{
		System.out.println("Test Finalize method");
	}
	
}

public class ObjectNGc 
{
	public static void main(String[] args) {
		
		Book b1 = Book.getInstance();
		
		Book b2 = Book.getInstance();
		
		System.out.println(b1.hashCode()+" "+b2.hashCode());
		
		b1.disp();
		
		b1 = null;
		
		System.out.println("after object null refrence");
		
		System.gc();
		
		System.out.println("after gc() execution");
		
	}
}
