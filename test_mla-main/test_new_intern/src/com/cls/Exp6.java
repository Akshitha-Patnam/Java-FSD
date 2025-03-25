package com.cls;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student //implements Comparable<Student>
{
	private int id;
	
	private String name;
	
	private int age;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
 /*
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
	
	*/
}

public class Exp6 {
	
	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student(5, "King", 33));
		stdList.add(new Student(3, "Rohit", 35));
		stdList.add(new Student(4, "Rahul", 29));
		stdList.add(new Student(1, "Rinku", 21));
		stdList.add(new Student(2, "Jaiswal", 19));
		
		System.out.println("before sorting student data");
		
		stdList.forEach(emp -> 
		System.out.println
		("ID : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()));
		
		//java 8 new features stream API
		
		List<Student> frmtData = 
				stdList.parallelStream()
				.sorted(Comparator.comparing(Student :: getName).reversed()
						.thenComparing(Student::getId))
				.collect(Collectors.toList());
		System.out.println("after sorting student data");
		frmtData.forEach(emp -> 
		System.out.println
		("ID : "+emp.getId()+" Name : "+emp.getName()+" Age : "+emp.getAge()));
		
		/*
		Student std = new Student();
		
		std.getId();
		*/
	}
}
