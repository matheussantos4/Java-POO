package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------- Gerenciamento Pedidos -------");
        System.out.print("Selecione uma opção: ");
        int opcao = 0;
        do {
            do {
                try {
                    opcao = sc.nextInt();
                    if (opcao <= 0) {
                        System.out.println("Opção inválida.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida.");
                    sc.nextLine();
                }
            } while (opcao <= 0 && opcao < 5);

            if (opcao == 1) {

    }
}