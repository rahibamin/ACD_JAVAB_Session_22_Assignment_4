package com.hibernate.assignment22.payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@ManyToOne
	private Employee employee;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_id", unique = true, nullable = false)
	private Integer accountid;
	
	@Column(name="account_bankname", unique = true, nullable = false)
	private String accountbankname;
	
	@Column(name="account_accountNumber", unique = true, nullable = false)
	private String accountbanknumber;

	@Column(name="account_routingNumber", unique = true, nullable = false)
	private String accountroutingnumber;
	
	@Column(name="account_type", unique = true, nullable = false)
	private String accounttype;
	
	@Column(name="emp_id", unique = true, nullable = false)
	private Integer empid;

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public String getAccountbankname() {
		return accountbankname;
	}

	public void setAccountbankname(String accountbankname) {
		this.accountbankname = accountbankname;
	}

	public String getAccountbanknumber() {
		return accountbanknumber;
	}

	public void setAccountbanknumber(String accountbanknumber) {
		this.accountbanknumber = accountbanknumber;
	}

	public String getAccountroutingnumber() {
		return accountroutingnumber;
	}

	public void setAccountroutingnumber(String accountroutingnumber) {
		this.accountroutingnumber = accountroutingnumber;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Account [employee=" + employee + ", accountid=" + accountid + ", accountbankname=" + accountbankname
				+ ", accountbanknumber=" + accountbanknumber + ", accountroutingnumber=" + accountroutingnumber
				+ ", accounttype=" + accounttype + ", empid=" + empid + "]";
	}

	
	
	
}
