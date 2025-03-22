package com.test;

public class Exp2
{
	//1 method taking the arguments and returning the value
	public int method1(int x, String y)
	{
		System.out.println("method 1");

		return 10;
	}

	//2 method not taking the arguments and not returning the value
	public void method2()
	{
	  System.out.println("method 2");
	}

	//3 method taking the arguments but not returning the value
	public void method3(String name)
	{
	  System.out.println("method 3");
	}

	//4 method not taking the arguments but returning the value
	public String method4()
	{
	   System.out.println("method 4");

	   return "hello";
	}

	public static void main(String[] args)
	{
	  Exp2 obj = new Exp2();

	  System.out.println(obj.method1(11, "abc"));
	  obj.method2();
	  obj.method3("java");
	  System.out.println(obj.method4());
	}
}