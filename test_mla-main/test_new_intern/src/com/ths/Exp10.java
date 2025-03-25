package com.ths;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ImplCall implements Callable<String>
{

	@Override
	public String call() throws Exception {
		
		return "Hell World";
	}
	
}

public class Exp10 {
	
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) throws Exception
	{
		
		ImplCall task = new  ImplCall();
		
		//Starting the task of Callable interface and holding the value in Future object
		Future<String> future = executor.submit(task);
		
		System.out.println(future.get().toString());
		
		executor.shutdown();
	}
}
