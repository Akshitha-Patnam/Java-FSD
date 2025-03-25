package com.ths;

class Add
{
	public void add()
	{
		System.out.println("add()");
	}
}

class Sub
{
	public void sub()
	{
		System.out.println("sub()");
	}
}
public class Exp2 implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("run()");
			
			Add obj1 = new Add();
			
			obj1.add();
			
			Thread.sleep(2000);
			
			Sub obj2 = new Sub();
			
			obj2.sub();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		
		//convert Runnable interface object to Thread class
		Thread t2 = new Thread(tg1, t1, "Transfer");
		Thread t3 = new Thread(tg1, t1, "Credit");
		
		ThreadGroup tg2  = new ThreadGroup("Math");
		
		Thread t4 = new Thread(tg2, t1, "Add");
		Thread t5 = new Thread(tg2, t1, "Div");
		
		t2.start();
		t5.start();
		
		System.out.println(tg1.activeCount()+" TG1 ");
		System.out.println(tg2.activeCount()+" TG2 ");
	}
}
