package com.abhi.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id()
	@Column(name="STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentname;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE_NO")
	private String phoneNo;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname="
				+ studentname + ", address=" + address + ", phoneNo=" + phoneNo
				+ "]";
	}
	
	
}
