package SingeltonDesignPattern.AbstractFactory;

public class Warrior implements Human {

	@Override
	public void attack() {
		System.out.println("Warrior is attacking");
	}

	@Override
	public void defend() {
		System.out.println("Warrior is defending");
	}

	@Override
	public void move() {
		System.out.println("Warrior is moving");
	}
}
