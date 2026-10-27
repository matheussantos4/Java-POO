package HerancaPolimorfismo.Ex3.src.Entities;

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

    public void Ioan(double amount) {
        deposit(amount);
    }
}
