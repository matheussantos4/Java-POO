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

        System.out.printf("AREA:%.2f" + ret1.area());
        System.out.printf("PERIMETER:%.2f" + ret1.perimeter());
        System.out.printf("DIAGONAL:%.2f" + ret1.diagonal());

        sc.close();

    }
}
