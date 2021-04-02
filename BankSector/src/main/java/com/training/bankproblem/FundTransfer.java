package com.training.bankproblem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FundTransfer {
	
	@Value("25000")
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "FundTransfer [amount=" + amount + "]";
	}
	

}
