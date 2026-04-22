package topicosPOO.MembrosEstaticos.Dollar;

import java.util.Scanner;
import java.util.Locale;

public class mainDollar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter c1 = new CurrencyConverter();

        System.out.print("What is the dollar price: ");
        c1.cot = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        c1.dol = sc.nextDouble();

        c1.converter();

        System.out.printf("Amount to be paid in reais = %.2f%n", c1.afterIOF());

        sc.close();

    }
}
