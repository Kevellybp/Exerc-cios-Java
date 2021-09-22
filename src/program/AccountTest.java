package program;

import application.BusinessAccount;
import entities.Account;
import entities.SaveAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account(1000, "Kev", 0.0);
		BusinessAccount bc = new BusinessAccount(002, "Feh", 0.0, 500.00);

		// UPCASTING
		Account acc1 = bc;
		Account acc2 = new BusinessAccount(1004, "is", 0.0, 0.0);
		Account acc3 = new SaveAccount(0, "iss", 0.1, 0.01);
	

	// DOWNCASTING 
	
	BusinessAccount acc4 = (BusinessAccount) acc2;
	if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount) acc3;
		((BusinessAccount) acc3).loan(200.0);
	}
	
	if (acc3 instanceof SaveAccount) {
		SaveAccount acc5 = (SaveAccount) acc3;
		acc5.updateBalance();
	}
	}
}
