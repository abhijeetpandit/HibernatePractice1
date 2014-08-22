package com.abhi.datamodel;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("contract employee")
@Table(name="CONTRACT_EMP_0000")
public class ContractEmp0 extends Emp0 {
	@Column(name="WORKING_HOURS")
	private Integer workingHours;
	
	@Column(name="SALARY_PER_HOUR")
	private Integer salaryPerHour;
	
	public Integer getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(Integer workingHours) {
		this.workingHours = workingHours;
	}
	public Integer getSalaryPerHour() {
		return salaryPerHour;
	}
	public void setSalaryPerHour(Integer salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	@Override
	public String toString() {
		return super.toString() +  "ContractEmp0 [workingHours=" + workingHours
				+ ", salaryPerHour=" + salaryPerHour + "]";
	}
	
	
}
