package com.ram.catalog.service;


public class Student {

	
	private String studentId;
	private String studentName;
	private String mobileNo;  
	private int courseId;
	
	public Student() {
		super();
	}

	public Student(String studentId, String studentName, String mobileNo, int courseId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.courseId = courseId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}
