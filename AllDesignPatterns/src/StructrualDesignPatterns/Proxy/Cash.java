package StructrualDesignPatterns.Proxy;

public class Cash implements Payment {

	@Override
	public void perform(Account account,double amount) {
		// TODO Auto-generated method stub
		account.witdraw(amount);

	}

}
