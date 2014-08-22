package com.abhi.datamodel;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("regular employee")
@Table(name="REGULAR_EMP_0000")
public class RegularEmp0 extends Emp0 {
	@Column(name="SALARY")
	private Integer salary;
	
	@Column(name="BONUS")
	private Integer bonus;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "RegularEmp0 [salary=" + salary + ", bonus=" + bonus + "]";
	}
}