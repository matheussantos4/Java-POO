package HerancaPolimorfismo.Ex3.src;

import HerancaPolimorfismo.Ex3.src.Entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account m = new Account(1212, "Matheus", 3000);
        System.out.print("Deposite um valor: ");
        double value = sc.nextDouble();
        m.deposit(value);
        System.out.println("Novo saldo: R$" + m.getBalance());

    }
}
