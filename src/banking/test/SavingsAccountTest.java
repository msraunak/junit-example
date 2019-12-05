package banking.test;

import org.junit.*;
import static org.junit.Assert.*;

import banking.Account;
import banking.SavingsAccount;
import banking.InsufficientFundsException;

public class SavingsAccountTest {
	
	private SavingsAccount savAcc;

	@Before
	public void setUp()
	{
		savAcc = new SavingsAccount("123000", 0);
	}

	@After
	public void tearDown()
	{
		savAcc = null;
	}

	@Test
	public void testTransfer() throws InsufficientFundsException
	{
		Account acc2 = new Account("123001", 100);
		savAcc.transfer(100, acc2);
		assertEquals(savAcc.getBalance(), 100.0, .00001); // the third argument is the epsilon
		assertTrue(acc2.getBalance()==0);
	}

	@Test(expected=InsufficientFundsException.class)
	public void testTransfer_InsufficientFundsException() throws InsufficientFundsException
	{
		Account acc3 = new Account("123002", 100);
		savAcc.transfer(101, acc3);
	}

	
}
