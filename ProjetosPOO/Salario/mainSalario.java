package ProjetosPOO.Salario;

import java.util.Locale;
import java.util.Scanner;

public class mainSalario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario f1 = new funcionario();

        System.out.print("Name: ");
        f1.name = sc.nextLine();
        System.out.print("Gross salary: ");
        f1.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        f1.Tax = sc.nextDouble();

        System.out.println("Employee: " + f1.name + " $" + f1.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        f1.percentage = sc.nextDouble();
        f1.increaseSalary();

        System.out.print("Updated data:" + f1.name + " $" + f1.NetSalary());

        sc.close();

    }
}
