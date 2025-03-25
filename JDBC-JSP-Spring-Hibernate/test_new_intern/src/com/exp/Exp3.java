package com.exp;

class Cat
{
	public Cat()//5
	{
		System.out.println("default");//6
	}
	
	public Cat(String msg)//3
	{
		this();//4
		System.out.println("from parameterised constructor");//7
	}
	
	public Cat(int id)//1
	{
		this("java");//2
		System.out.println("int arg constructor");//8
	}
}

public class Exp3 {
	
	public static void main(String[] args) {
		Cat obj = new Cat(100);
	}
}
