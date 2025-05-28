package SingeltonDesignPattern.AbstractFactory;

public class OgreFactory implements ICharacterFactory {

	@Override
	public IGameCharacter createCharacter(String characterType) {
		if (characterType.equalsIgnoreCase("Mage")) {
			return new Mage();
		}
		return null;
	}

}
