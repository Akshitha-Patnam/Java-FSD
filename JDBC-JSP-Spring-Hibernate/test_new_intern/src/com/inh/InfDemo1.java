package com.inh;

interface Inf5
{
	void human();
	void animal();
}

interface Inf6
{
	void dog();
	void cat();
}

interface Inf7
{
	void book();
	void color();
}

interface Inf8 extends Inf5, Inf6, Inf7
{
	void dance();
}

class Impl1 implements Inf8, Inf6, Inf7, Inf5
{
	public void dance()
	{
		System.out.println("INF8 METHOD OVERRIDED");
	}

	@Override
	public void human() {
		
		System.out.println("inf5 method overrided");
		
	}

	@Override
	public void animal() {
		
		System.out.println("inf5 method overrided");
	}

	@Override
	public void book() {
		
		System.out.println("inf7 method overrided");
	}

	@Override
	public void color() {
		
		System.out.println("inf7 method overrided");
	}

	@Override
	public void dog() {
		
		System.out.println("inf6 method overrided");
	}

	@Override
	public void cat() {
		
		System.out.println("INF6 METHOD OVERRIDED");
	}
}

public class InfDemo1 {
	
	public static void main(String[] args) {
		
		Impl1 obj = new Impl1();
		
		obj.animal();
		obj.book();
		obj.cat();
		obj.human();
		obj.dance();
		obj.dog();
		obj.color();
	}
}
