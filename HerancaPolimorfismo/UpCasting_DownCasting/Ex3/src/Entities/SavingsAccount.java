package HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src.Entities;

public class SavingsAccount extends Account {

    private double interestRate;

    public double getInterest() {
        return interestRate;
    }

    public void setInterest(double interest) {
        this.interestRate = interest;
    }

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance) {
        super(number, holder, balance);
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withDrawn(double amount) {
        balance -= amount;
    }
}
