package com.exp;

class Dog
{
	public Dog()
	{
		System.out.println("default");
	}
	
	public Dog(String msg)
	{
		System.out.println("single string arg "+msg);
	}
}

class Fox extends Dog
{
	public Fox()
	{
		super();
		System.out.println("fox default constructor");
	}
	
	
}

public class Exp4 {
	
	public static void main(String[] args) {
		
		Fox obj = new Fox();
	}
}
