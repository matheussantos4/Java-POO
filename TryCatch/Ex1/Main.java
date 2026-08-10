package TryCatch.Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int a, b, resultado;
            System.out.println("Divisão Teste.");
            System.out.print("Digite um número: ");
            a = sc.nextInt();
            System.out.print("Digite outro número: ");
            b = sc.nextInt();
            resultado = a / b;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero !");
        } catch (InputMismatchException e) {
            System.out.println("Isso não é um número!");
        }
        sc.close();
    }
}
