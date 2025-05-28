package SingeltonDesignPattern.AbstractFactory;

public class HumanFactory implements ICharacterFactory {

	@Override
	public IGameCharacter createCharacter(String characterType) {
		if (characterType.equalsIgnoreCase("Warrior")) {
			return new Warrior();
		}
		
		if (characterType.equalsIgnoreCase("Knight")) {
            return new Knight();
            }
		return null;
	}

}
