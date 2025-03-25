package com.inh;

interface FunInf5
{
	String greetUser(int id, String name, String msg);
}

public class FunDemo3 {
	
	public static void main(String[] args) {
		
		FunInf5 obj = (int id, String name, String msg)-> 
		{
			System.out.println(id+" "+name+" "+msg);
			return "hi hello";
		};
		
		obj.greetUser(101, "OmSri", "Developer");
	}
}
