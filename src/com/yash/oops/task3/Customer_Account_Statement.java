package com.yash.oops.task3;

public class Customer_Account_Statement {

	private int CAID;
	private int CustId;
	private int amount;
	private int deposit_withdrawl;
	private String deposit_date;

	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}

	public int getCAID() {
		return CAID;
	}

	public void setCAID(int cAID) {
		CAID = cAID;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(int deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}
}
