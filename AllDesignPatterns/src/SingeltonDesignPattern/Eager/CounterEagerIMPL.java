package SingeltonDesignPattern.Eager;

public class CounterEagerIMPL {
	private static CounterEagerIMPL instance = new CounterEagerIMPL(); //define private static instance of the class
	private int count = 0;

	private CounterEagerIMPL() {
		count = 0;
	}

	public static CounterEagerIMPL getInstance() {
		return instance;
	}

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
	

}
