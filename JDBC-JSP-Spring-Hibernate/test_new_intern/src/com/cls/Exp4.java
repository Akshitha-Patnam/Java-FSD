package com.cls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Exp4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> listNames = new ArrayList<>();
		
		listNames.add("java");
		listNames.add("python");
		listNames.add("spring");
		listNames.add("microservices");
		listNames.add("hibernate");
		listNames.add("java");
		
		Iterator<String> itr = listNames.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator<String> ltr = listNames.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		for(String dt : listNames)
		{
			System.out.println(dt);
		}
		
		Collections.sort(listNames);//ascending order
		
		System.out.println(listNames);
		
		Collections.sort(listNames.reversed());//reverse order
		
		
		System.out.println(listNames);
		
	}
}
