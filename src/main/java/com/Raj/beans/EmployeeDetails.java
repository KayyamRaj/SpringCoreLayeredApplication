package com.Raj.beans;

import java.sql.Date;
import java.time.LocalDate;

public class EmployeeDetails {
	private Integer empId;
	private String name ;
	private String email ;
	private String CreatedBy ;
	private LocalDate CreatedDate ;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public LocalDate getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(LocalDate localDate) {
		CreatedDate = localDate;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", name=" + name + ", email=" + email + ", CreatedBy=" + CreatedBy
				+ ", CreatedDate=" + CreatedDate + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()="
				+ getCreatedDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
