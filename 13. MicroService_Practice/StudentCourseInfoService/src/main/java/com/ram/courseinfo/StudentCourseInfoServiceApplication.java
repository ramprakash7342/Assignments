package com.ram.courseinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
@EnableEurekaClient
public class StudentCourseInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseInfoServiceApplication.class, args);
	}
	
	@Bean
	public OpenAPI openApiConfig() {
		return new OpenAPI().info(apiInfo());
	}
	
	public Info apiInfo() {
		Info info=new Info();
		info
		    .title("StudentCourseInfo Service ")
		    .description("This service is giving info about course.")
		    .version("v1.0.0");
		return info;
		    
	}

}
