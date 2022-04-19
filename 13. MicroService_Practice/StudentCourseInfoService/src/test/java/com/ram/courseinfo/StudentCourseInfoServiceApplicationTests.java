package com.ram.courseinfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ram.courseinfo.controller.CourseController;
import com.ram.courseinfo.entity.Course;
import com.ram.courseinfo.repository.CourseRepository;

@SpringBootTest
class StudentCourseInfoServiceApplicationTests {

	@Autowired
	private CourseController controller;
	
	@MockBean
	private CourseRepository repository;
	
	@Test
	void getAllCourse() {
		when(repository.findAll()).thenReturn(Stream.of(
				
				           new Course(1,"B.Tech",4),
				           new Course(2,"BCA",3)
				             ).collect(Collectors.toList()));
		
		assertEquals(2,controller.getAllCourse().size());
	}
	
	

}
