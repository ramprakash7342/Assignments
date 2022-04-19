package com.ram.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ApiCall {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackStudentDetails")
	public Student getStudentDetails(String studentId) {
		Student student=restTemplate.getForObject("http://STUDENT-INFO-SERVICE/find-by-id/"+studentId, Student.class);
//		Student student=restTemplate.getForObject("http://localhost:8080/find-by-id/"+studentId, Student.class);

		return student;
	}
	
	public Student postStudentDetails(Student student) {
		 restTemplate.postForEntity("http://STUDENT-INFO-SERVICE/save-student", student, Student.class);
		 return student;
	}
	
	public Student getFallbackStudentDetails(String studentId) {
		return new Student("Student Server is down","Student Server is down","Student Server is down",0);
	}
	
	@HystrixCommand(fallbackMethod = "getFallbackCourseDetails")
	public Course getCourseDetails(int courseId) {
		Course course=restTemplate.getForObject("http://STUDENT-COURSE-INFO-SERVICE/find-by-id/"+courseId, Course.class);
	//	Course course=restTemplate.getForObject("http://localhost:8081/find-by-id/"+courseId, Course.class);

		return course;
	}
	
	public Course getFallbackCourseDetails(int courseId) {
		return new Course(0,"Course Server id down",0);
	}
}
