package com.test;

public class Exp9 {
	
	public static void main(String[] args)
	{
		//for loop
		/*
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("7 X "+i+" = "+(7*i));
		}
		*/
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] names = {"java", "net", "python", "spring"};
		
		for(int i = 0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		int l = arr.length;
		
		int x = 0;
		
		while(x < l)
		{
			System.out.println(arr[x]);
			
			x++;
		}
		
		int y = 0;
		
		do {
			System.out.println(arr[y]);
			
			y++;
		}
		while(y < l );
		
		//for each loop
		for(int j : arr)
		{
			System.out.println(j);
		}
	}

}
