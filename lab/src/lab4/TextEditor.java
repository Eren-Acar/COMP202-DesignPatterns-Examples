package lab4;

public class TextEditor {
	private String text = "";
	private History history = new History();
	private EditorMemento memento;
	private EditorMemento redoMemento;
	    

    public void write(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public EditorMemento save() {
        // TODO: Return a new memento with the current text
        memento = new EditorMemento(text);
        history.addToStack(memento);
        return memento;
        
        
    }

    public void restore(EditorMemento memento) {
        // TODO: Restore text from memento
    	this.text = memento.getText();
    	redoMemento = memento;
    	history.addToStack(redoMemento);
    	
    }

	public void setText(String string) {
		// TODO Auto-generated method stub
		this.text = string;
		
	}
    
    

}
