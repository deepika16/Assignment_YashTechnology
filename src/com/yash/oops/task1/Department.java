package com.yash.oops.task1;

public class Department {

	private int deptId;
	private String dname;

	public Department(int deptId, String dname) {
		this.deptId  = deptId;
		this.dname = dname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dname=" + dname + ", getDeptId()=" + getDeptId() + ", getDname()="
				+ getDname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
