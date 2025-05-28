package SingeltonDesignPattern.AbstractFactory;

public class Mage implements Ogre{
	@Override
	public void attack() {
		System.out.println("Mage is attacking");
	}

	@Override
	public void defend() {
		System.out.println("Mage is defending");
	}

	@Override
	public void move() {
		System.out.println("Mage is moving");
	}

}
