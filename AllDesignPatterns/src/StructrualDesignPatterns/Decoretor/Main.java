package StructrualDesignPatterns.Decoretor;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Car car = new Car();
		boolean validInput = true;
		
		
		
		
		
		do {
			System.out.println("Enter the car details: Sport Car or Luxury Car: ");
			String carType = scanner.nextLine();
		switch (carType.toLowerCase()) {
		case "sport":
			car = new SportCar(car);
			break;
		case "luxury":
			car = new LuxuryCar(car);
			break;
		default:
			System.out.println("Invalid car type.");
			return;
		}
		
		System.out.println("Enter the car brand: " + car.toString());
		System.out.println("Do you want to continiue? (yes/no): ");
		String continueInput = scanner.nextLine();
		
		if(continueInput.equals("no")) {
            validInput = false;
        } 
		
		} while(validInput);
		
		
		
	}

}
