package SOLID.InterfaceSegragationPrincible;

public class LaserPrinter implements OfficeEquipment {

	@Override
	public void scan() { //LaserPrinter does not have scanning functionality so its voilated Interface Segregation Principle
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
