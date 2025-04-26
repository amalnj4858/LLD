package ChainOfResponsitibilityPattern;

public interface DenominatorFinder {
    public void setNextDenominatorFinder(DenominatorFinder denominatorFinder);

    public void dispense(int currency) ;
}
