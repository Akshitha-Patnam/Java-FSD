package com.exp;

public class Exp1 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Hello");
			System.out.println(10/5);
			System.out.println("Java");
			
			int[] arr = {10,20,30,40};
			System.out.println(arr[2]);
			
			String str = "java";
			
			System.out.println(str.charAt(2));
			
			System.out.println("End");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero for den");
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("check yor array size");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check your string length");
		}
		catch(Exception e)
		{
			System.out.println("check your inputs");
		}
		
		finally
		{
			System.out.println("finally block");
		}
		
		
	}
}
