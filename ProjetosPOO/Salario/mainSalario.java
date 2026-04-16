package ProjetosPOO.Salario;

import java.util.Locale;
import java.util.Scanner;

public class mainSalario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario f1 = new funcionario();

        System.out.print("Name: ");
        f1.nome = sc.nextLine();
        System.out.print("Gross salary: ");
        f1.salary = sc.nextDouble();
        System.out.print("Tax: ");
        f1.Tax = sc.nextDouble();

        System.out.print("Employee: " + f1.nome + " $"+ (f1.salary - f1.Tax));

        System.out.print("Which percentage to increase salary ?");
        


        sc.close();

    }

}
