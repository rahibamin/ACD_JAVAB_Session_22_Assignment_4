package com.hibernate.assignment22.payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="salaryformonth")

public class Payroll {

	@ManyToOne
	private Employee employee;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="som_id", unique = true, nullable = false)
	private Integer payrollid;

	@Column(name="som_date", unique = true, nullable = false)
	private String payrolldate;

	@Column(name="som_totalSalary", unique = true, nullable = false)
	private String payrolltotalsalary;

	@Column(name="som_paymentStatus", unique = true, nullable = false)
	private String payrollsatus;
	
	@Column(name="emp_id", unique = true, nullable = false)
	private Integer empid;

	
	public Integer getPayrollid() {
		return payrollid;
	}

	public void setPayrollid(Integer payrollid) {
		this.payrollid = payrollid;
	}

	public String getPayrolldate() {
		return payrolldate;
	}

	public void setPayrolldate(String payrolldate) {
		this.payrolldate = payrolldate;
	}

	public String getPayrolltotalsalary() {
		return payrolltotalsalary;
	}

	public void setPayrolltotalsalary(String payrolltotalsalary) {
		this.payrolltotalsalary = payrolltotalsalary;
	}

	public String getPayrollsatus() {
		return payrollsatus;
	}

	public void setPayrollsatus(String payrollsatus) {
		this.payrollsatus = payrollsatus;
	}

	
	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Payroll [employee=" + employee + ", payrollid=" + payrollid + ", payrolldate=" + payrolldate
				+ ", payrolltotalsalary=" + payrolltotalsalary + ", payrollsatus=" + payrollsatus + ", empid=" + empid
				+ "]";
	}


}
