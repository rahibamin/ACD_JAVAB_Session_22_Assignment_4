package com.hibernate.assignment22.payroll;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id", unique = true, nullable = false)
	private Integer empid;
	
	@Column(name="emp_name", unique = true, nullable = false)
	private String empname;
	
	@Column(name="emp_email", unique = true, nullable = false)
	private String empemail;

	@Column(name="emp_phone", unique = true, nullable = false)
	private String empphone;
	
	@Column(name="emp_salaryreference", unique = true, nullable = false)
	private Integer empsalaryrefe;
	
	@Column(name="emp_account", unique = true, nullable = false)
	private String empAccount;
	
	@Column(name="emp_overpay", unique = true, nullable = false)
	private Integer empoverpay;
	
	@Column(name="emp_status", unique = true, nullable = false)
	private String empstatus;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Set <Account> account;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Set <Payroll> salayformonth;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private Set <Salary> salary;
	
	
	
	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getEmpphone() {
		return empphone;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}

	public Integer getEmpsalaryrefe() {
		return empsalaryrefe;
	}

	public void setEmpsalaryrefe(Integer empsalaryrefe) {
		this.empsalaryrefe = empsalaryrefe;
	}

	public String getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}

	public Integer getEmpoverpay() {
		return empoverpay;
	}

	public void setEmpoverpay(Integer empoverpay) {
		this.empoverpay = empoverpay;
	}

	public String getEmpstatus() {
		return empstatus;
	}

	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empphone=" + empphone
				+ ", empsalaryrefe=" + empsalaryrefe + ", empAccount=" + empAccount + ", empoverpay=" + empoverpay
				+ ", empstatus=" + empstatus + ", account=" + account + ", salayformonth=" + salayformonth + ", salary="
				+ salary + "]";
	}

	
	
	
}
