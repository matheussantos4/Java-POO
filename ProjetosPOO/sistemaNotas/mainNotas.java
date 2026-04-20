package ProjetosPOO.sistemaNotas;

import java.util.Scanner;
import java.util.Locale;

public class mainNotas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        aluno al1 = new aluno();
        System.out.print("Enter name: ");
        al1.nome = sc.nextLine();
        System.out.print("Notas: ");
        al1.not1 = sc.nextInt();
        al1.not2 = sc.nextInt();
        al1.not3 = sc.nextInt();
        //35+35+30 = 100.
        al1.soma();

        if (al1.soma() < 60) {
            System.out.print("PASSED");

        } else System.out.print("FAILED");

        sc.close();

    }
}
