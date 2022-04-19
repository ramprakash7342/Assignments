package com.ram.catalog.emailservice;

import org.springframework.stereotype.Service;

@Service
public class EmailReceiverService {

	private String email;
	private String body;
	private String subject;
	private String attechment;
	
	public EmailReceiverService() {
		super();
	}

	public EmailReceiverService(String email, String body, String subject, String attechment) {
		super();
		this.email = email;
		this.body = body;
		this.subject = subject;
		this.attechment = attechment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAttechment() {
		return attechment;
	}

	public void setAttechment(String attechment) {
		this.attechment = attechment;
	}
	
	
}
