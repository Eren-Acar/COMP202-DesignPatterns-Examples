package BehavioralDesignPatterns.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor textEditor = new TextEditor();
		textEditor.setText("Hello");
		textEditor.save();
		textEditor.append(" World");
		textEditor.save();
		textEditor.append("!");
		textEditor.save();
		
		System.out.println("Current Text: " + textEditor.getText());
		textEditor.undo();
		System.out.println("After Undo: " + textEditor.getText());
		textEditor.undo();
		System.out.println("After Undo: " + textEditor.getText());
		textEditor.append("!");
		textEditor.append("!");
		
		textEditor.redo();
		textEditor.redo();
		System.out.println("After Redo: " + textEditor.getText());
		
		textEditor.undo();
		textEditor.undo();
		System.out.println("After Undo: " + textEditor.getText());
		

	}

}
