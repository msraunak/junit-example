package banking;


public class SavingsAccount extends Account {

	
	double interestRate;

	public SavingsAccount(String accountNumber, double amt)
	{
	super(accountNumber, amt);
	interestRate = 0.01;
	}

	public void setInterestRate(double r)
	{
		interestRate = r;
	}

	public double getInterestRate()
	{
		return interestRate;
	}

	public void accrueInterest()
	{
		this.balance = this.balance + this.balance * interestRate;
	}

}
