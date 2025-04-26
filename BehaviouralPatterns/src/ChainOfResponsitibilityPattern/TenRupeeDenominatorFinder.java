package ChainOfResponsitibilityPattern;

public class TenRupeeDenominatorFinder implements DenominatorFinder {
    DenominatorFinder nextDenominatorFinder;

    @Override
    public void setNextDenominatorFinder(DenominatorFinder denominatorFinder) {
        this.nextDenominatorFinder = denominatorFinder;
    }

    @Override
    public void dispense(int currency) {
        if(currency >= 10) {
            int num = currency/10;
            int rem = currency%10;
            System.out.println("Dispensing " + num + " 10 rupee notes");
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
