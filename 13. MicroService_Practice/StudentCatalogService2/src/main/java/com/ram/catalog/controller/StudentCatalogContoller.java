package com.ram.catalog.controller;

import javax.mail.MessagingException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.catalog.emailservice.EmailSenderService;
import com.ram.catalog.service.ApiCall;
import com.ram.catalog.service.Course;
import com.ram.catalog.service.Student;
import com.ram.catalog.service.StudentDetails;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/student")
public class StudentCatalogContoller {
	
	
	
	@Autowired
	private ApiCall apiCall;
	
	@Autowired
    private EmailSenderService emailSenderService;
 
    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException {
        emailSenderService.sendMailWithAttachment("ram.11806114@lpu.in",
                "This is email body.",
                "This email subject", 
                        "C:\\Users\\HP\\Desktop\\my documents\\RamPrakash_11806114.pdf")
        ;

    }
	

	@GetMapping("/{studentId}")
	@Operation(summary="It will return student info with course assigned to him!")
	public StudentDetails getStudentDetails(@PathVariable String studentId) {
		
		Student student=apiCall.getStudentDetails(studentId);
		
		Course course=apiCall.getCourseDetails(student.getCourseId());
		
		StudentDetails details=new StudentDetails();
     	BeanUtils.copyProperties(student, details);
//		details.setStudentId(student.getStudentId());
//		details.setStudentName(student.getStudentName());
//		details.setMobileNo(student.getMobileNo());
		details.setCourse(course);
		return details;
	}
	
	@PostMapping("/save-student-details")
	public Student postStudentDetails(@RequestBody Student student) {
		return apiCall.postStudentDetails(student);
	}
	
}
