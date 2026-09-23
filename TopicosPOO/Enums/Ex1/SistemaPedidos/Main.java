package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        GerenciadorPedidos gerenciador = new GerenciadorPedidos();

        /* teste
        Pedido n1 = new Pedido(5);
        Pedido n2 = new Pedido(7);
        gerenciador.adicionarPedido(n1);
        gerenciador.adicionarPedido(n2);
        */

        int opcao = 0;
        do {
            System.out.println("------- Gerenciamento Pedidos -------");
            System.out.println("(1) Adicionar pedidos");
            System.out.println("(2) Listar pedidos");
            System.out.println("(3) Remover pedidos");
            System.out.println("(4) Modificar pedidos");
            System.out.println("(5) Encerrar");
            System.out.println();
            System.out.print("Selecione uma opção: ");

            do {
                try {
                    opcao = sc.nextInt();
                    if (opcao <= 0 || opcao > 5) {
                        System.out.println("Opção inválida.");
                        System.out.print("Selecione uma opção: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida.");
                    sc.nextLine();
                    opcao = 0;
                    System.out.print("Selecione uma opção: ");
                }
            } while (opcao <= 0 || opcao > 5);

            if (opcao == 1) {

            } else if (opcao == 2) {
                gerenciador.listarPedidos();
            }
        } while (opcao != 5);
        System.out.println("Saindo...");
    }
}