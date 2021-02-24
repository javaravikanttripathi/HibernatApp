package com.rk.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.rk.address.Address;

@Entity
@Table(name = "emp")
public class Employee {
	@Id
	private int empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private double empSal;
	@OneToOne
	@JoinColumn(name = "addrfk", unique = true)
	private Address empAddr;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Address getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(Address empAddr) {
		this.empAddr = empAddr;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
