package application;

import entities.Account;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer numberInteger, String holder, Double balance, Double loanLimit) {
		super(numberInteger, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit)
			balance += amount - 10;
	}

	@Override
	public void withdraaw(double amount) {
		super.withdraaw(amount);
		balance -= 2.0;
	}
}
