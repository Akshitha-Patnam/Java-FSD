package com.test;

public class StaticNInstanceDemo {
	
	int id = 123123;
	
	static int pin = 34545;
	
	public void dog()
	{
		System.out.println(id);
		
		System.out.println(StaticNInstanceDemo.pin);
	}
	
	public static void cat()
	{
		StaticNInstanceDemo obj = new StaticNInstanceDemo();
		
		System.out.println(obj.id);
		
		System.out.println(pin);
	}
	
	public static void main(String[] args) {
		
		cat();
		
		StaticNInstanceDemo obj = new StaticNInstanceDemo();
		
		obj.dog();
	}

}
