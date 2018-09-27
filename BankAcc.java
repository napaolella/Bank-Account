
public class BankAcc {
	
	private String name;
	private int accNum;
	private double balance;
	
	public BankAcc(String accName, int num)
	{
		name = accName;
		accNum = num;
		balance = 0;
	}
	
	public BankAcc(String accName, int num, double principle)
	{
		name = accName;
		accNum = num;
		balance = principle;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdrawl(double amount)
	{
		balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "acc holder: " + name + ". acc balance: " + balance + ". acc num: " + accNum;
	}

}
