package com.yash.oops.task3;

public class Main {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.setCustId(1);
		cust.setCustname("abc");
		cust.setAccountno(121);
		cust.setCust_dob("2-09-2001");
		cust.setCust_address("Indore");
		cust.setBranch_Obj("sbi Branch");
		cust.setCust_account_opening_date("22-10-2021");
		
		
		System.out.println("Customer Id: " + cust.getCustId());
		System.out.println("Customer Name: " + cust.getCustname());
		System.out.println("Customer Account No: " + cust.getAccountno());
		System.out.println("Customer DOB: " + cust.getCust_dob());
		System.out.println("Customer Address: " + cust.getCust_address());
		System.out.println("Customer Branch: " + cust.getCust_account_opening_date());
		System.out.println("Customer Account Opening Date: " + cust.getBranch_Obj());
	}

}
