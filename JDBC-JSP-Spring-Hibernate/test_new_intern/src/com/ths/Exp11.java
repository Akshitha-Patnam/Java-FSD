package com.ths;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableImpl implements Runnable {

	public void run() {
		System.out.println("run() from a different thread than Main");
	}
}

public class Exp11 {
	
	static ExecutorService executor = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {
		// Creating and running runnable task using Thread class
		RunnableImpl task = new RunnableImpl();
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		// Creating and running runnable task using Executor Service.
		executor.submit(task);
		
		executor.shutdown();
	}
}
