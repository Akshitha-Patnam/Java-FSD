package com.test;

public class MethodOLnR {
	
	//method over loading : method heading is same and signature is different
	/*
	 * 1. type of the arguments
	 * 2. no of the arguments
	 * 3. order of the arguments
	 */
	
	public void add(int x, int y)
	{
		System.out.println("no of the arguments");
	}
	
	public void add(long x, float y)
	{
		System.out.println("type of the arguments");
	}
	
	public void add(float x, long y)
	{
		System.out.println("order of the arguments");
	}
	
	public static void main(String[] args) {
		
		MethodOLnR obj = new MethodOLnR();
		
		obj.add(10, 30);
		obj.add(33l, 3.33f);
		obj.add(44.55f, 939l);
	}
}
