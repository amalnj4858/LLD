package ChainOfResponsitibilityPattern;

public class HundredRupeeDenominatorFinder implements DenominatorFinder{
    DenominatorFinder nextDenominatorFinder;

    @Override
    public void setNextDenominatorFinder(DenominatorFinder denominatorFinder) {
        this.nextDenominatorFinder = denominatorFinder;
    }

    @Override
    public void dispense(int currency) {
        if(currency >= 100) {
            int num = currency/100;
            int rem = currency%100;
            System.out.println("Dispensing " + num + " 100 rupee notes");
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
