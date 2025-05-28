package StructrualDesignPatterns.Decoretor;

public class Car {
	private String brand;
	private String color;
	private String model;
	
	public Car(String brand, String color, String model) {
		this.brand = brand;
		this.color = color;
		this.model = model;
	}
	
	public Car() {
		super();
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", model=" + model + "]";
	}
}
