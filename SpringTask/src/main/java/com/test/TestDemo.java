package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
		public static void main(String[] args) {
			
			/*ApplicationContext ctx= new AnnotationConfigApplicationContext(FruitConfig.class);
			Fruits obj=(Fruits)ctx.getBean("getFru");
			System.out.println(obj);
			*/
			ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
			Fruits obj=ctx.getBean("fru", Fruits.class);
			System.out.println(obj);
		}

}
