package com.abhi.datamodel;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="EMP_000")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn( discriminatorType= DiscriminatorType.STRING, name="type")
public class Emp0 {
	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="EMP_NAME")
	private String empName;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp0 [empId=" + empId + ", empName=" + empName + "]";
	}
}