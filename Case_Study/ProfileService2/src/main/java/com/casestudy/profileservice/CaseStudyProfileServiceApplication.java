package com.casestudy.profileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
@EnableEurekaClient
public class CaseStudyProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseStudyProfileServiceApplication.class, args);
	}
	
	@Bean
	public OpenAPI openApiConfig() {
		return new OpenAPI().info(apiInfo());
	}
	
	public Info apiInfo() {
		Info info=new Info();
		info
		    .title("Profile Microservice")
		    .description("This is the profile service of Shopping cart website running on port 8081")
		    .version("v1.0.0");
		return info;
		    
	}


}
