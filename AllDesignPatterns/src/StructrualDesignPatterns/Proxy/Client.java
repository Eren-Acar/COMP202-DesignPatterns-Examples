package StructrualDesignPatterns.Proxy;

public class Client {
	private Account account;
	
	public Client() {
		account= new Account();
	}
	
	public void makePayment(double amount, PaymentMethod method) {
		
		Bank.processPayment(this.account,amount,method);
	}
	
	public void  getBalance() {
		System.out.println("Balance: "+ account.balance);
	}
	
	
	public static void main(String[] args) {
		
		Client client=new Client();
		
		client.makePayment(100, PaymentMethod.CREDITCARD);
		
		client.getBalance();
		
		
	}

}
