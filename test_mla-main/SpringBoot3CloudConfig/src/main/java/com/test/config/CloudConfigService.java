package com.test.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfigService 
{
	@Bean
	public RouteLocator getRoutesConfig(RouteLocatorBuilder builder)
	{
		return builder.routes( )
					   .route(r -> r.path("/employee/*") 
					    .uri("http://localhost:8081/"))
						
							 
					   .route(r -> r.path("/order/*")
							   .uri("http://localhost:8082/"))
				
				.build();
	}
}

/*
 * only gateway api
 * 
 * gateway-mvc -> webflux 
 * 
 */
