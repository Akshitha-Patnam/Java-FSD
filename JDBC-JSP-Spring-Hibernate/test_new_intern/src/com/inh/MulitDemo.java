package com.inh;


class C
{
	public void method1()
	{
		System.out.println("Top Most Parent class");
	}
}

class D extends C
{
	public void method2()
	{
		System.out.println("Intermediate base class");
	}
}

class E extends D
{
	public void method3()
	{
		System.out.println("Bottom most child class");
	}
}


public class MulitDemo {
	
	public static void main(String[] args) {
		
		E obj = new E();
		
		obj.method3();
		obj.method2();
		obj.method1();
		
		C obj1 = new C();
		
		C obj2 = obj;
		
		Object obj3 = obj1;
		
		//byte -> short -> int -> long
		//long -> int -> short -> byte
		
		long x = 100;
		
		int y = (int)x;
	}
}
