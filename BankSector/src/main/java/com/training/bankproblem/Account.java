package com.training.bankproblem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {

	@Value("Salary")
	private String accountType;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + "]";
	}
	
}
