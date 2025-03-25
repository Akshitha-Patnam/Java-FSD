package com.ths;

public class LifecycleTh extends Thread
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(200);
			System.out.println("run()");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		
		LifecycleTh t1 =  new LifecycleTh();
		
		System.out.println(t1.getName());
		
		System.out.println("Before starting thread state : "+t1.getState());
		System.out.println("Before startting thread status : "+t1.isAlive());
		
		t1.start();
		
		System.out.println("after starting thread state  : "+t1.getState());
		System.out.println("after starting trhead status : "+t1.isAlive());
		
		Thread.sleep(100);
		
		System.out.println("in sleep thread state : "+t1.getState());
		System.out.println("in sleep thread status : "+t1.isAlive());
		
		t1.join();
		
		System.out.println("after joining thread state  : "+t1.getState());
		System.out.println("after joining thread status : "+t1.isAlive());
	}
}
