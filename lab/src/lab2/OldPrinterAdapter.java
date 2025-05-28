package lab2;

public class OldPrinterAdapter implements Printable {
	private OldPrinter oldPrinter;
	
    public OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

	@Override
	public void print(String content) {
		// TODO: Call oldPrint on the wrapped OldPrinter
		oldPrinter.oldPrint(content);
	}

}
