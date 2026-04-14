package ProjetosPOO.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class retanguloMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ret ret1 = new ret();

        System.out.println("Enter rectangle width and height: ");
        ret1.a = sc.nextDouble();
        ret1.b = sc.nextDouble();

        Double area1 = ret1.area();
        Double perimeter1 = ret1.perimeter();
        Double diagonal1 = ret1.diagonal();

        System.out.println("area:" + area1);
        System.out.println("perimeter:" + perimeter1);
        System.out.println("diagonal:" + diagonal1);

        sc.close();

    }
}
