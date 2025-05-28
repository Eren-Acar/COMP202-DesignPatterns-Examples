package SingeltonDesignPattern.AbstractFactory;

public class CharacterFactoryGenerator {
	public static ICharacterFactory getFactory(String factoryType) {
		if (factoryType.equals("Human")) {
			return new HumanFactory();
		} else if (factoryType.equalsIgnoreCase("Ogre")) {
			return new OgreFactory();
		}
		throw new IllegalArgumentException("Factory not found");
	}

}
