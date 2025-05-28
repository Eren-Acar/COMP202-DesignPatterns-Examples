package StructrualDesignPatterns.Decoretor;

public class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return (this.car.toString() + " \n Added Sport Car features:..... \n");
                
	}

}
