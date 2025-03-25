package com.arrys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String str = "java hello this is string session";
		
		List<String> reverseData = new ArrayList<>();
		
		String[] strAr = str.split(" ");
		
		for(String dt : strAr)
		{
			reverseData.add(dt);
		}
		
		Collections.reverse(reverseData);
		
		System.out.println(reverseData);
	}
}
