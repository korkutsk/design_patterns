public class CreditCardOperator implements BankOperator{
    private CashOperator cashOperator;

    public CreditCardOperator() {
        this.cashOperator = new CashOperator();
    }

    @Override
    public void operate() {
        System.out.println("Pay by card");
        cashOperator.operate();
    }
}
