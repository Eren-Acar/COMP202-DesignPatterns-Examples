package BehavioralDesignPatterns.Memento;
//Originator class
public class TextEditor {
	private String content;
	private Caretaker caretaker = new Caretaker();
	
	public void setText(String content) {
        this.content = content;
    }
	
	public String getText() {
		return content;
	
	}
	
	public void append(String text) {
		this.content += text;
	}
	
	public void save() {
	caretaker.addToStack(new Memento(this.content));
	}
	
	public void undo() {
		Memento m = caretaker.getLastMemento();
		
		if (m != null) {
			this.content = m.getContent();
		} else {
			System.out.println("No more undo operations available.");
		}
	}
	
	public void redo() {
		Memento m = caretaker.GetRedoItem();
		if (m != null) {
			this.content = m.getContent();
		} else {
			System.out.println("No more redo operations available.");
		}
    
	}

}
