package SingeltonDesignPattern.AbstractFactory;

import java.util.Scanner;

public class GameClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subtype = null;
		IGameCharacter character;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character type: ");
		String characterType = scanner.nextLine();
		ICharacterFactory characterFactory = CharacterFactoryGenerator.getFactory(characterType);
		
		switch (characterType) {
		case "Human":
			System.out.println("Knight or Warrior: ");
			subtype = scanner.nextLine();	
			break;
		
		case "Ogre": 
            System.out.println("Mage: ");
            subtype = scanner.nextLine();
            break;
        }
		
		character = characterFactory.createCharacter(subtype);
		
		//Test case 1
		System.out.println((character instanceof Knight));

	}

}
