package com.test;

class Exp1
{
	//Method overriding: Method heading is same and body is different
	
		public void draw()
		{
			System.out.println("Circle");
		}
}

class Exp2 extends Exp1
{
	@Override
	public void draw()
	{
		System.out.println("Square");
	}
}

public class MethodOverride {
	
	public static void main(String[] args) {
		
		Exp2 obj = new Exp2();
		
		obj.draw();
	}
	
}
