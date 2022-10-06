package com.yash.oops.task3;

public class Customer {
	private int custId;
	private int accountno;
	private String custname;
	private String cust_address;
	private String cust_dob;
	private String cust_account_opening_date;
	private String Branch_Obj;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public String getBranch_Obj() {
		return Branch_Obj;
	}

	public void setBranch_Obj(String branch_Obj) {
		Branch_Obj = branch_Obj;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", Branch_Obj=" + Branch_Obj + "]";
	}

}
