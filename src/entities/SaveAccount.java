package entities;

public class SaveAccount extends Account {

	private Double interestRate;
	
	public SaveAccount() {
		super();
	
	}

	public SaveAccount(Integer numberInteger, String holder, Double balance, Double interestRate) {
		super(numberInteger, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraaw (double amount) {
		balance -= amount;
	}
}
