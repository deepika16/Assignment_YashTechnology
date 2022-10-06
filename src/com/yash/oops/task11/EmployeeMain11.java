package com.yash.oops.task11;

import java.util.Date;

public class EmployeeMain11 {

	public static void main(String[] args) {
		Employee11 e = new Employee11();
		e.setEmpid(1);
		e.setEmpname("Nikhil");
		e.setEmpsalary(9000);
		e.setEmpaddress("indore");
		e.setEmp_dob(new Date("04/04/1998"));
		e.setEmp_doj(new Date("30/08/2022"));

		System.out.println(e.toString());
	}

}
