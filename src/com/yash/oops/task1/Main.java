package com.yash.oops.task1;

public class Main {

	public static void main(String[] args) {

		Department dept[] = new Department[2];
		dept[0] = new Department(121, "IT");
		dept[1] = new Department(122, "CS");
/*---------------------------Employee Data-----------------------------*/
		Employee emp = new Employee();
		emp.setSalary(20000);
		emp.setBase_location("Indore");
		emp.setContactno("123456");
		emp.setDate_of_joining("02-09-2022");
		emp.setEmailid("deepika.sarode@yash.com");
		emp.setDeptobj("CS");

		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Base Location: " + emp.getBase_location());
		System.out.println("Contact No: " + emp.getContactno());
		System.out.println("Date of Joining: " + emp.getDate_of_joining());
		System.out.println("Email Id: " + emp.getEmailid());
		System.out.println("DeptObj: " + emp.getDeptobj());
		
/*---------------------------Customer Data-----------------------------*/
		Customer cust = new Customer();
		cust.setDate_of_registration("06-09-2022");
		cust.setDelivery_address("Indore");
		cust.setContactno("78897686");
		cust.setEmail_id("abc@gmail.com");
		
		System.out.println("Date_of_registration: " + cust.getDate_of_registration());
		System.out.println("Delivery_address: " + cust.getDelivery_address());
		System.out.println("Contact No: " + cust.getContactno());
		System.out.println("Email_id: " + cust.getEmail_id());
	}

}
