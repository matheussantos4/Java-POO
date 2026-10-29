package HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src.Entities;

public class BusinessAccount extends Account {

    private double LoanLimit;

    public double getLoanLimit() {
        return LoanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        LoanLimit = loanLimit;
    }

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        LoanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= LoanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withDrawn(double amount) {
        super.withDrawn(amount);
        balance -= 2.0;
    }
}
