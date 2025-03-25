package com.test;

import org.springframework.context.annotation.Bean;

public class FruitConfig {
	@Bean
	public static Fruits getFru()
	{
		return new Fruits();
	}
}
