package com.cls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exp1 {
	
	public static void main(String[] args) {
		
		//Collection data = new ArrayList();
		
		//List data = new ArrayList();
		
		//ArrayList data = new ArrayList();
		
		LinkedList data = new LinkedList();
		
		data.add(10);
		data.add("java");
		data.add(20);
		data.add("java");
		data.add(10);
		data.add(33.44f);//updating
		data.add(22.22d);
		data.add(8833l);
		data.add('A');
		data.add(false);
		
		System.out.println(data);
		
		System.out.println(data.size());
		
		data.set(5, "Rohit");
		
		System.out.println(data);
		
		data.remove(6);
		
		System.out.println(data);
		
		System.out.println(data.get(8));
		
		System.out.println(data.contains(10000));
		
		System.out.println(data.getFirst()+" "+data.getLast());
		
		//Iterator itr = data.iterator();
		
		ListIterator ltr = data.listIterator();
		
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
	}
}
