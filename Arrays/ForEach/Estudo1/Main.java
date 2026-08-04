package Arrays.ForEach.Estudo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 4 números: ");
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());

        int div = 0;
        try {
            System.out.print("Dividir por quanto? ");
            div = sc.nextInt();
            for (int nums : num) {
                System.out.printf(nums + " / " + div + " = " + nums / div + " %n");
            }
        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por zero !");
            sc.nextLine();
        }
    }
}

