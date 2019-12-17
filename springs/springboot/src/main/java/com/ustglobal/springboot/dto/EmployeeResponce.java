package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponce {
	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeBean> employeebeans;
	
	public List<EmployeeBean> getEmployeebeans() {
		return employeebeans;
	}
	public void setEmployeebeans(List<EmployeeBean> employeebeans) {
		this.employeebeans = employeebeans;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
