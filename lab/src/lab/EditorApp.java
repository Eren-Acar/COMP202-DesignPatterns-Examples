package lab;

import java.util.Scanner;

public class EditorApp {
	public static void main(String[] args) {
		DocumentFactory factory = new DocumentFactory();
		
			Scanner scanner = new Scanner(System.in);
				System.out.println("Enter document type (pdf/word): ");
				
				String type = scanner.nextLine();
				Document doc = factory.createDocument(type);
				
				if (doc != null) {
					doc.open();
				} else {
					System.out.println("Invalid document type");
				}
			
		
		
		
		

}
}
