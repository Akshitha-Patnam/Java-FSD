package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StdConfig {
	
	List<String> skills = Arrays.asList("king","qn");
	
	@Bean
	public static Student getStdObj()
	{
		return new Student();
	}
	
	@Bean
	public static Order getOrderObj()
	{
		return new Order(501, "lenovo", 234);
	}
}
