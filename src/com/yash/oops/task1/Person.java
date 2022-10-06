package com.yash.oops.task1;

public class Person extends Employee{

	private int Pid;
	private String pname;
	private String paddress;
	private String dob;

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [Pid=" + Pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + "]";
	}
}
