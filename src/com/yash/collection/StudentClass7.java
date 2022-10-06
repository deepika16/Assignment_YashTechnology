package com.yash.collection;

public class StudentClass7 {

	private int rollno;
	private String sname, classname;
	private String totalmarks;
	private int Percentage;

	public int getPercentage() {
		return Percentage;
	}

	public void setPercentage(int percentage) {
		Percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "StudentClass7 [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
}
