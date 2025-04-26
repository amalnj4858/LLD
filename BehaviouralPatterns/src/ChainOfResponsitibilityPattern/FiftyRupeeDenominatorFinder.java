package ChainOfResponsitibilityPattern;

public class FiftyRupeeDenominatorFinder implements DenominatorFinder{
    DenominatorFinder nextDenominatorFinder;

    @Override
    public void setNextDenominatorFinder(DenominatorFinder denominatorFinder) {
        this.nextDenominatorFinder = denominatorFinder;
    }

    @Override
    public void dispense(int currency) {
        if(currency >= 50) {
            int num = currency/50;
            int rem = currency%50;
            System.out.println("Dispensing " + num + " 50 rupee notes");
            if(rem == 0) {
                System.out.println("Finished Printing");
                return;
            }
            this.nextDenominatorFinder.dispense(rem);
        } else {
            this.nextDenominatorFinder.dispense(currency);
        }
    }
}
