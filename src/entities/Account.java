package entities;

public class Account {

	private Integer numberInteger;
	private String holder;
	protected Double balance;
	
	
public Account () {
	
}

public Account(Integer numberInteger, String holder, Double balance) {
	this.numberInteger = numberInteger;
	this.holder = holder;
	this.balance = balance;
}

public Integer getNumberInteger() {
	return numberInteger;
}

public void setNumberInteger(Integer numberInteger) {
	this.numberInteger = numberInteger;
}

public String getHolder() {
	return holder;
}


public Double getBalance() {
	return balance;
}

public void setBalance(Double balance) {
	this.balance = balance;
}
public void withdraaw (double amount) {
	balance -= amount + 5.0;
}

public void deposit (double amount ) {
	balance += amount;
}
}
