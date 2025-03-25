package com.ths;

class Item
{
	boolean valSet = false;
	
	int value = 0;
	
	public synchronized void putItem(int x)
	{
		try
		{
			if(valSet)
			{
				wait();
			}
			
			value = x;
			
			System.out.print("Producer thread produced one item -> "+value);
			
			valSet = true;
			
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public synchronized void getItem()
	{
		try
		{
			if(!valSet)
			{
				wait();
			}
			
			System.out.println(" Consumer consumed one item -> "+value);
			
			valSet = false;
			
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable
{
	public Item item;
	
	int i;
	
	public Producer(Item item)
	{
		this.item = item;
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(1000);
				item.putItem(++i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable
{
	public Item item;
	
	public Consumer(Item item)
	{
		this.item = item;
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.sleep(500);
				item.getItem();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ITCDemo {
	
	public static void main(String[] args) {
		
		Item item = new Item();
		
		Producer pr = new Producer(item);
		
		Consumer cr = new Consumer(item);
		
		Thread t1 = new Thread(pr);
		
		Thread t2 = new Thread(cr);
		
		t1.start();
		t2.start();
	}

}
