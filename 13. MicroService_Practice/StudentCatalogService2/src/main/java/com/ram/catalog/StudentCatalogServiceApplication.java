package com.ram.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;



@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class StudentCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentCatalogServiceApplication.class, args);
	}
	
	@Bean
	public OpenAPI openApiConfig() {
		return new OpenAPI().info(apiInfo());
	}
	
	public Info apiInfo() {
		Info info=new Info();
		info
		    .title("StudentCatalog Service")
		    .description("This is mircoservice is taking inputs from StudentInfo and CouseInfo services.")
		    .version("v1.0.0");
		return info;
		    
	}

}
