package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		Fruits obj=ctx.getBean("fru", Fruits.class);
		System.out.println(obj);
	}

}
