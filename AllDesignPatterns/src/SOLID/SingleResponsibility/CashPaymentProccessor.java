package SOLID.SingleResponsibility;

public class CashPaymentProccessor implements IPaymentProccessor {

	@Override
	public void processCashPayment() {
		System.out.println("Cash payment processed");
	}

}
