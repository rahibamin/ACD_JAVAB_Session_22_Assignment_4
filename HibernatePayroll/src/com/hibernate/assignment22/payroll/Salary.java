package com.hibernate.assignment22.payroll;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salary")
public class Salary {
	@ManyToOne
	private Employee employee;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="salary_id", unique = true, nullable = false)
	private Integer salaryid;
	
	@Column(name="salary_base", unique = true, nullable = false)
	private Double salarybase;
	
	@Column(name="salary_travel", unique = true, nullable = false)
	private Double salarytravel;

	@Column(name="salary_food", unique = true, nullable = false)
	private Double salaryfood;
	
	@Column(name="salary_insurance", unique = true, nullable = false)
	private Double salaryinsurance;
	
	@Column(name="emp_id", unique = true, nullable = false)
	private Integer empid;
	

	public Integer getSalaryid() {
		return salaryid;
	}

	public void setSalaryid(Integer salaryid) {
		this.salaryid = salaryid;
	}	

	public Double getSalarybase() {
		return salarybase;
	}

	public void setSalarybase(Double salarybase) {
		this.salarybase = salarybase;
	}

	public Double getSalarytravel() {
		return salarytravel;
	}

	public void setSalarytravel(Double salarytravel) {
		this.salarytravel = salarytravel;
	}

	public Double getSalaryfood() {
		return salaryfood;
	}

	public void setSalaryfood(Double salaryfood) {
		this.salaryfood = salaryfood;
	}

	public Double getSalaryinsurance() {
		return salaryinsurance;
	}

	public void setSalaryinsurance(Double salaryinsurance) {
		this.salaryinsurance = salaryinsurance;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	
	
	public void SalaryCal(Double salarybase) {
		salarybase = (salarybase*1.10);
		this.salarybase = salarybase;
		this.salaryinsurance = (salarybase*0.10);
		this.salaryfood = (salarybase*0.10);
		this.salarytravel = (salarybase*0.15);
	}

	@Override
	public String toString() {
		return "Salary [employee=" + employee + ", salaryid=" + salaryid + ", salarybase=" + salarybase
				+ ", salarytravel=" + salarytravel + ", salaryfood=" + salaryfood + ", salaryinsurance="
				+ salaryinsurance + ", empid=" + empid + "]";
	}

	
	
}
