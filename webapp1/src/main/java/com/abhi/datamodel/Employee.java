package com.abhi.datamodel;

public class Employee {
	private Integer employeeId;
	private String name;
	private Integer departmentId;
	
	public Employee() {
	}
	public Employee(Integer employeeId, String name, Integer departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.departmentId = departmentId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name
				+ ", departmentId=" + departmentId + "]";
	}
}
