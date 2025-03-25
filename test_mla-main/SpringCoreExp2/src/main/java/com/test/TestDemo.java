package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	
	public static void main(String[] args) {
		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Student obj = ctx.getBean("std", Student.class);
		
		System.out.println(obj);
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StdConfig.class);
		
		Student obj = ctx.getBean("getStdObj", Student.class);
		
		obj.setId(111);
		obj.setName("Kohli");
		
		List<String> skills = Arrays.asList("python", ".net", "c++");
		
		obj.setSkills(skills);
		
		System.out.println(obj);
		
		*/
		
		//Order obj = new Order(101, "Apple", 345);
		
		//System.out.println(obj.id()+" "+obj.name()+" "+obj.price());
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StdConfig.class);
		
		Order obj = ctx.getBean("getOrderObj", Order.class);
		
		System.out.println(obj);
	}
}
// 1 using multiple bean class xml and annotation
// 2 using multiple bean record xml and annotation
/*
 * Doctor Appoint
 * 
 * User : id, name, age, email, mobile, location
 * Doctor : id, name, email, mobile, desg, available
 * 
 * 
 * 
 * 
 */


