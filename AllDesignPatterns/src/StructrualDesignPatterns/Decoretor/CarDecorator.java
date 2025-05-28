package StructrualDesignPatterns.Decoretor;

public abstract class CarDecorator extends Car {
	protected Car car;
	
	public CarDecorator(String brand, String color, String model) {
		super(brand, color, model);
	}

	public CarDecorator(Car car) {
		super();
		this.car = car;
	}
}
