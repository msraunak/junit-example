package bankexample;
/*
 * A Simple BankAccount
 */
public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String initNumber, double initBalance) {
	    accountNumber = initNumber;
	    balance = initBalance;
	}

	public String getAcountNumber() {
	    return accountNumber;
	}

	/* getter */
	public double getBalance() {
	    return balance;
	}
	
	
	public double deposit(double amount) {
	     balance = balance + amount;
	     return balance;
	}

	 public double withdraw(double amount) {
		  balance = balance - amount;
		  return balance;
	}

}
