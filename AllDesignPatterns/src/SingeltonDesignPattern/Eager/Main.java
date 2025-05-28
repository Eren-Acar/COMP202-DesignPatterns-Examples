package SingeltonDesignPattern.Eager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterEagerIMPL counter1 = CounterEagerIMPL.getInstance();
		counter1.increment();
		
		CounterEagerIMPL counter2 = CounterEagerIMPL.getInstance();
		counter2.increment();
		System.out.println(counter2.getCount());
		System.out.println(counter1.getCount());

	}

}
