package com.casestudy.productservice.exception;

import java.util.Date;

public class ApiErrors {

	private int status;
	private String message;
	private long timestamp;
	private String path;
	
	public ApiErrors() {
		
	}

	public ApiErrors(int status, String message, String path) {
		super();
		this.status = status;
		this.message = message;
		this.path = path;
		this.timestamp=new Date().getTime();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
