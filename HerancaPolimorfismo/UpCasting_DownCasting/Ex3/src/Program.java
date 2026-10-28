package HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src;

import HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src.Entities.Account;
import HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src.Entities.BusinessAccount;
import HerancaPolimorfismo.UpCasting_DownCasting.Ex3.src.Entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Testes de funcionamento.

        Scanner sc = new Scanner(System.in);

        Account acc1 = new Account(1212, "Matheus", 3000);
        Account acc2 = new SavingsAccount(1002, "Santos", 44943);
        Account acc3 = new BusinessAccount(1122, "Quaresma", 11212, 2323);

        System.out.print("Deposite um valor: ");
        double value = sc.nextDouble();
        acc1.deposit(value);
        System.out.println("Novo saldo: R$" + acc1.getBalance());

        if (acc3 instanceof BusinessAccount acc4) {
            acc4.loan(1000);
            System.out.println("Loan!");
        }

        if (acc2 instanceof SavingsAccount acc4) {
            acc4.updateBalance();
            System.out.println("Update!");
        }

        sc.close();
    }
}
