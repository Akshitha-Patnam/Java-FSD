package com.test;

public class Exp7
{
	public static void main(String[] args)
	{
	  int age = 22;
	  int wt = 65;
	  int ht = 174;

	  if(age >= 22)
	  {
	  	if(wt >= 55 && wt <= 65)
	  	{
	  		if(ht >= 170)
	  		{
	  			System.out.println("Application submitted successfully.");
	  		}
	  		else
	  		{
	  		  System.out.println("hight is not matching.");
	  		}
	  	}
	  	else
	  	{
	  	 System.out.println("weight is not matching.");
	  	}
	  }
	  else
	  {
	   System.out.println("age is not matching.");
	  }
	}
}