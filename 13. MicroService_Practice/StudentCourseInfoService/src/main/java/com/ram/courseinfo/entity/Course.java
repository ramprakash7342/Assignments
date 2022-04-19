package com.ram.courseinfo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="course-Info")
public class Course {

	@Id
	private int courseId;
	private String courseName;
	private int duration;
	
	public Course() {
		super();
	}

	public Course(int courseId, String courseName, int duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
