package SOLID.InterfaceSegragationPrincible;

public class OnlineCustomer implements IPayment,  IOrder {

	@Override
    public void makePayment() {
        // TODO Auto-generated method stub
        System.out.println("Online payment");
    }

    @Override
    public void giveOrder() {
        // TODO Auto-generated method stub
        System.out.println("Online order");
    }

}
