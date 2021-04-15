package com.durgasoft.beans;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private long balance;
	
	public String getAccNo() {
		return accNo;
	}
	public String getAccName() {
		return accName;
	}
	public String getAccType() {
		return accType;
	}
	public long getBalance() {
		return balance;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
