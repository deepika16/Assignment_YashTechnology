package com.yash.collection;

public class Employee9 {

	private int empid;
	private String empname;
	private int salary;
	private String deptname;
	private String address;

	@Override
	public String toString() {
		return "Employee9 [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", deptname=" + deptname
				+ ", address=" + address + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
