package TopicosPOO.MembrosEstaticos.TesteStatic;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double idade = sc.nextDouble();

        testClass al1 = new testClass(nome, idade);

        testClass.addAluno(al1);

        System.out.println(al1);
        
    }
}
