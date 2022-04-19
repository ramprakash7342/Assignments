package com.ram.studentinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.studentinfo.entity.Student;
import com.ram.studentinfo.repository.StudentRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/student-info")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	@Operation(summary="It will save student details into Database!")
	public String saveStudentInfo(@RequestBody Student student) {
	    studentRepository.save(student);	
		return "Student details saved successfully";
	}
	
	@GetMapping("/find-all")
	@Operation(summary="it will find all students stored in DB!")
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/find-by-id/{id}")
	@Operation(summary="It will return specific student with given id!")
	public Optional<Student> getById(@PathVariable String id) {
		return studentRepository.findById(id);
	}
	
	@GetMapping("/find-by-name/{name}")
	@Operation(summary="It will return all students with given name !")
	public List<Student> getByName(@PathVariable String name) {
		return studentRepository.findByStudentName(name);
	}
}
