package com.arrys;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		String str5  = "hello";
		
		System.out.println(str1 == str2);//true
		
		System.out.println(str3 == str4);//false
		
		System.out.println(str1 == str3);//false
		
		System.out.println(str2 == str5);//false
		
		System.out.println(str1.equals(str3));//true
		
		
		String str7 = str1.concat(" version 23");
		
		
		
		System.out.println(str1);
		
		System.out.println(str7);
		
	}
}
