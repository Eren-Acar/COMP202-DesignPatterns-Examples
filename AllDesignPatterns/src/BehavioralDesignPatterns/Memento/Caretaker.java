package BehavioralDesignPatterns.Memento;

import java.util.Stack;

public class Caretaker {
	private static Stack<Memento> stack = new Stack<Memento>();
	private static Stack<Memento> redoStack = new Stack<Memento>();
	

	public void addToStack(Memento memento) {
		stack.push(memento);
	}
	
	public Memento getLastMemento() {
		if (!stack.isEmpty()) {
			Memento memento = stack.pop();
			redoStack.push(memento);
			return memento;
		}
		return null;
	}

	public static Memento getFromStack() {
		return stack.pop();
	}
	
	public Memento GetRedoItem() {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            stack.push(memento);
            return memento;
        }
        return null;
    }

	public static boolean isStackEmpty() {
		return stack.isEmpty();
	}
	
	public static boolean isRedoStackEmpty() {
		return redoStack.isEmpty();
	}
	
	

}
