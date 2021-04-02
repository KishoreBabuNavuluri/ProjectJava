package com.training.bankproblem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bean")
public class Bank {

	@Autowired
	private Customer customer;
	@Autowired
	private Account account;
	@Autowired
	private FundTransfer fundtransfer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public FundTransfer getFundtransfer() {
		return fundtransfer;
	}
	public void setFundtransfer(FundTransfer fundtransfer) {
		this.fundtransfer = fundtransfer;
	}
	@Override
	public String toString() {
		return "Bank [customer=" + customer + ", account=" + account + ", fundtransfer=" + fundtransfer + "]";
	}
	

	
}
