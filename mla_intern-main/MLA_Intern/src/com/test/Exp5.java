package com.test;
import java.util.Scanner;

public class Exp5
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter your age");

	  int age = sc.nextInt();

	  if(age == 18)
	  {
	    System.out.println("just eligible");
	  }
	  else if(age > 18)
	  {
	    System.out.println("most eligible");
	  }
	  else
	  {
	  	System.out.println("not eligible");
	  }

	}
}