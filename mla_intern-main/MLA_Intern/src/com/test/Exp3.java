package com.test;

public class Exp3
{
	public void calculate(int x, int y)
	{
	  System.out.println(x+y);
	  System.out.println(x-y);
	  System.out.println(x/y);
	  System.out.println(x*y);
	}

	public static void main(String[] args)
	{
	  Exp3 obj = new Exp3();

	  obj.calculate(10,5);
	}
}