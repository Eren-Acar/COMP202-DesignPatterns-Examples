package lab;

public class DocumentFactory {
	public Document createDocument(String type) {
		if (type.equalsIgnoreCase("pdf")) {
			return new PDFDocument();
		} else if (type.equalsIgnoreCase("word")) {
			return new WordDocument();
		} else {
			return null;
		}
	}

}
