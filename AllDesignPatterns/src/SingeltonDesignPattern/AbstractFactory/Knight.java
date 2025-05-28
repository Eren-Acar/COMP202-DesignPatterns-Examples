package SingeltonDesignPattern.AbstractFactory;

public class Knight implements Human{

	@Override
	public void attack() {
		System.out.println("Knight is attacking");
	}

	@Override
	public void defend() {
		System.out.println("Knight is defending");
	}

	@Override
	public void move() {
		System.out.println("Knight is moving");
	}

	
}
