package StructrualDesignPatterns.Proxy;

public class Bank {
	
	static void processPayment(Account account,
			double amount,
			PaymentMethod method) {
		if(method==PaymentMethod.CASH) {
			Cash cash= new Cash();
			cash.perform(account, amount);
		}
		else if(method==PaymentMethod.CREDITCARD) {
			CreditCard card=new CreditCard();
			card.perform(account, amount);
		}
	};

}
