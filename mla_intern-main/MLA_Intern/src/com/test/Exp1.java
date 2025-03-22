package com.test;

public class Exp1
{
	//global variables
	int a;
	double b;
	boolean c;
	char d;

	public void disp()
	{
	  //local variable
	  int j = 19;
	  double k;
	  boolean l;
	  char m;

	  System.out.println(j);
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);

	}
	public static void main(String[] args) {
		
		Exp1 obj = new Exp1();

		obj.disp();
	}

	
}