package StructrualDesignPatterns.Decoretor;

public class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return (this.car.toString() + " \n Added Luxury Car features:..... \n");
                
	}

}
