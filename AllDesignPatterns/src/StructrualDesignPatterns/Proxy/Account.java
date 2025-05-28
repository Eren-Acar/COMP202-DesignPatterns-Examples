package StructrualDesignPatterns.Proxy;

public class Account {
	
	public  double balance;
	
	public void witdraw(double amount) {
		
		balance-=amount;
		
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	
	

}
