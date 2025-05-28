package SOLID.LiskovSubstitutionPrinciple;

public class devekuşu extends Bird {

	@Override
	public void feed() {
		throw new UnsupportedOperationException("Devekuşu uçamaz");
	}
}
