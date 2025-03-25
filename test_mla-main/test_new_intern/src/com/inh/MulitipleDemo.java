package com.inh;

interface Inf1
{
	void fox();
	void tiger();
}

interface Inf2
{
	void book();
}

abstract class Abs
{
	public void dog()
	{
		System.out.println("abs implemented");
	}
	
	public abstract void cat();
}

class Impl extends Abs implements Inf1,Inf2
{
	@Override
	public void cat()
	{
		System.out.println("abs method overrided");
	}
	
	@Override
	public void fox()
	{
		System.out.println("inf1 fox() overrided");
	}
	
	@Override
	public void tiger()
	{
		System.out.println("inf1 tiger() overrided");
	}
	
	@Override
	public void book()
	{
		System.out.println("inf2 book() overrided");
	}
}

public class MulitipleDemo {
	
	public static void main(String[] args) {
		
		Impl obj = new Impl();
		
		obj.cat();
		obj.dog();
		obj.fox();
		obj.tiger();
		obj.book();
	}
}
