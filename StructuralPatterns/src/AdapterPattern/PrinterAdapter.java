package AdapterPattern;

public class PrinterAdapter implements Printer {
    LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        this.legacyPrinter.printDocument();
    }
}
