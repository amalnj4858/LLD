package ChainOfResponsitibilityPattern;

public class Currency {

    int currency;

    public Currency(int currency) {
        this.currency = currency;
    }

    public void dispenseCurrency(DenominatorFinder denominatorFinder) {
        if(currency%10 != 0) {
            System.out.println("Cant dispense this amount");
            return;
        }
        denominatorFinder.dispense(this.currency);
    }
}
