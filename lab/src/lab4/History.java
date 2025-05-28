package lab4;

import java.util.Stack;

public class History {
	// TODO: Implement undo/redo stack using List or Stack
	
	private Stack<EditorMemento> undoStack = new Stack<>();
	private Stack<EditorMemento> redoStack = new Stack<>();
	
	public void addToStack(EditorMemento memento) {
		undoStack.push(memento);
	}
	
	public EditorMemento undo() {
		if (!undoStack.isEmpty()) {
			EditorMemento memento = undoStack.pop();
			redoStack.push(memento);
			return memento;
		}
		return null; 
	}
	
	public EditorMemento redo() {
		if (!redoStack.isEmpty()) {
			EditorMemento memento = redoStack.pop();
			undoStack.push(memento);
			return memento;
		}
		return null;
	}

}
