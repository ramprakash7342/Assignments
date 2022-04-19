package com.ram.courseinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.courseinfo.entity.Course;
import com.ram.courseinfo.repository.CourseRepository;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/save")
	@Operation(summary="It will save the course into CourseInfoDb!")
	public String saveCourseInfo(@RequestBody Course course) {
		courseRepository.save(course);
		return "Course detailes saved successfully";
	}
	
	@GetMapping("/find-all")
	@Operation(summary="It will return all the courses store in Database!")
	public List<Course> getAllCourse(){
		return courseRepository.findAll();
	}
	
	@GetMapping("/find-by-id/{id}")
	@Operation(summary="It will return specific course with given Id!")
	public Optional<Course> getById(@PathVariable int id)
	{
		return courseRepository.findById(id);
	}
	
	@GetMapping("find-by-duration/{duration}")
	@Operation(summary="It will return specific course with given Duration!")
	public List<Course> getbyDuration(@PathVariable int duration){
		return courseRepository.findByDuration(duration);
	}
}
