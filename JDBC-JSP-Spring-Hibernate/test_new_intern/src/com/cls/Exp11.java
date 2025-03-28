package com.cls;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Exp11 {
	
	public static void main(String[] args) {
		
		//Collection data = new TreeSet();
		//Set data = new TreeSet();
		
		TreeSet<String> data = new TreeSet<>();
		
		data.add("java");
		data.add("hello");
		data.add("king");
		data.add("kohli");
		data.add("shami");
		data.add("sky");
		data.add("java");
		data.add("king");
		data.add("zaheer");
		
		System.out.println(data.reversed());
		
		Iterator<String> itr = data.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		data.forEach(x -> System.out.println(x));
		
		System.out.println(data.subSet("king", "sky"));
		System.out.println(data.getFirst());
	}
}
