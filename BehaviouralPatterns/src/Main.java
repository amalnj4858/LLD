import ChainOfResponsitibilityPattern.Currency;
import ChainOfResponsitibilityPattern.FiftyRupeeDenominatorFinder;
import ChainOfResponsitibilityPattern.HundredRupeeDenominatorFinder;
import ChainOfResponsitibilityPattern.TenRupeeDenominatorFinder;
import VisitorPattern.AreaVisitor;
import VisitorPattern.Circle;
import VisitorPattern.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HundredRupeeDenominatorFinder hundredRupeeDenominatorFinder = new HundredRupeeDenominatorFinder();
        FiftyRupeeDenominatorFinder fiftyRupeeDenominatorFinder = new FiftyRupeeDenominatorFinder();
        TenRupeeDenominatorFinder tenRupeeDenominatorFinder = new TenRupeeDenominatorFinder();
        hundredRupeeDenominatorFinder.setNextDenominatorFinder(fiftyRupeeDenominatorFinder);
        fiftyRupeeDenominatorFinder.setNextDenominatorFinder(tenRupeeDenominatorFinder);

        Currency currency = new Currency(480);
        currency.dispenseCurrency(hundredRupeeDenominatorFinder);


        System.out.println("\n");


        Square square = new Square(5);
        Circle circle = new Circle(5);
        AreaVisitor areaVisitor = new AreaVisitor();
        square.accept(areaVisitor);
        circle.accept(areaVisitor);
        System.out.println("Total area: " + areaVisitor.getTotalArea());
    }
}