package topicosPOO.MembrosEstaticos.RaioCirculo;

import java.util.Locale;
import java.util.Scanner;

public class raioCirculo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator cal1 = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = cal1.circumference(radius);
        double v = cal1.volume(radius);

        System.out.printf("Circumference:  %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value:  %.2f%n", cal1.PI);

        sc.close();
    }
}
