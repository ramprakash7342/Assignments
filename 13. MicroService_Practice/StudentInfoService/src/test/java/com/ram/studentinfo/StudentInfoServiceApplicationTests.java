package com.ram.studentinfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ram.studentinfo.controller.StudentController;
import com.ram.studentinfo.entity.Student;
import com.ram.studentinfo.repository.StudentRepository;

@SpringBootTest
class StudentInfoServiceApplicationTests {

	@Autowired
	private StudentController controller;
	
	@MockBean
	private StudentRepository  repository;
	
	
	@Test
	void getAllStudent() {
		when(repository.findAll()).thenReturn(Stream.of(
				                        new Student("1","ram","8938884124",2),
				                        new Student("2","rahul","839988584",3)
				                        ).collect(Collectors.toList()));
		
		assertEquals(2,controller.getAllStudent().size());
	}
	
	

}
