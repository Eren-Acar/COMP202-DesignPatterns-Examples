package SingeltonDesignPattern.StaticBlock;

public class CounterStaticBlock {
	
	private static CounterStaticBlock instance;
	private int count = 0;

	private CounterStaticBlock() {
		count = 0;
	}

	static {
		
			instance = new CounterStaticBlock();
		
	}

	public static CounterStaticBlock getInstance() {
		return instance;
	}

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

}
