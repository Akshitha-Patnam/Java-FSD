package com.arrys;

public class StringDemo4 {
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		
		sb.append(" 23");
		
		System.out.println(sb);
		
		System.out.println(sb.substring(1,3));
		
		String str = "hello";
		
		StringBuffer sb1 = new StringBuffer(str);
		
		System.out.println(sb1.reverse());
		
		
	}
}


