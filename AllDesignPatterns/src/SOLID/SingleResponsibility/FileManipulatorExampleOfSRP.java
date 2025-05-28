package SOLID.SingleResponsibility;

import java.io.File;

public abstract class FileManipulatorExampleOfSRP {
	
	public abstract void printOnTerminal(File file);
	
	public abstract void copyandPaste(File inputfile, File outputfile);
	
	public abstract void findandReplace(File file, String oldText, String newText);
	
	//public abstract void findandDelete(File file, String text); no need to implement this method as it is not used in the code.
	
//There are two operations so, its not suitable for Single Responsibility Principle.
	
	public void findAndDelete(File file, String text) {
		this.findandReplace(file, text, "");
	}
}
