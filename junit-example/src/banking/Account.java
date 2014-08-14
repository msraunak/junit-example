package banking;
/*
 * A Simple BankAccount
 */
public class Account {

	private String accountNumber;
	protected double balance;
	
	public Account(String accNumber, double initBalance) {
	    accountNumber = accNumber;
	    balance = initBalance;
	}
	
	public Account(Account otherAcc){
		this.accountNumber = otherAcc.getAcountNumber();
		this.balance = otherAcc.getBalance();
	}
	
	public String getAcountNumber() {
	    return accountNumber;
	}

	public double getBalance() {
	    return balance;
	}
	
	/* transfer money from another account to this one */
	public void transfer(int amt, Account acc) throws InsufficientFundsException
	{
	  	acc.withdraw(amt);
	  	deposit(amt);
	}

	/* If there is sufficient fund, withdraw from this bank account the given amount */
	public void withdraw(int amt) throws InsufficientFundsException
	{
	  	if (checkSufficientFunds(amt))
	  		balance -= amt;
	  	else
	  		throw new InsufficientFundsException("Insufficient funds.");
	  }

	
	public double deposit(double amount) {
	     balance = balance + amount;
	     return balance;
	}


	 private boolean checkSufficientFunds(int amt)
	  {
	  	if (balance >= amt)
	  		return true;
	  	else
	  		return false;
	  }
}

	 
	 

