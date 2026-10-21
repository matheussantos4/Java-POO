package TopicosPOO.Enums.Ex1.src.SistemaPedidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GerenciadorPedidos gerenciador = new GerenciadorPedidos();


        Pedido n1 = new Pedido(5);
        Pedido n2 = new Pedido(7);
        gerenciador.adicionarPedido(n1);
        gerenciador.adicionarPedido(n2);

        int opcao = 0;
        do {

            // Menu inicial do usuário.
            System.out.println("------- Gerenciamento Pedidos -------");
            System.out.println("(1) Adicionar pedidos");
            System.out.println("(2) Listar pedidos");
            System.out.println("(3) Remover pedidos");
            System.out.println("(4) Modificar pedidos");
            System.out.println("(5) Encerrar");
            System.out.println();
            System.out.print("Selecione uma opção: ");

            // Validação inical da entrada de dados da opção.
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

            // Validação da entrada de dados do número da mesa.
            if (opcao == 1) {
                int mesa = 0;
                do {
                    try {
                        System.out.print("Digite o Nº da mesa: ");
                        mesa = sc.nextInt();
                        if (mesa < 0 || mesa > 50) {
                            System.out.println("Mesa inválida.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Mesa inválida.");
                        sc.nextLine();
                        mesa = 0;
                    }
                } while (mesa < 0 || mesa > 50);

                // Adição de pedidos a lista caso a mesa esteja de acordo.
                Pedido pedidoNovo = new Pedido(mesa);
                if (gerenciador.verificarDuplicata(pedidoNovo)) {
                } else {
                    gerenciador.adicionarPedido(pedidoNovo);
                    System.out.println("Pedido adicionado!");
                }

                // Listagem de pedidos ja existentes.
            } else if (opcao == 2) {
                gerenciador.listarPedidos();

                // Remoção de pedidos.
            } else if (opcao == 3) {
                int idRemover = 0;
                //Função para verificar se Array pedidos se encontra vazio antes da busca.
                if (gerenciador.pedidoVazioVerif()) {
                } else {
                    do {
                        System.out.println("Qual pedido desejar remover?");
                        gerenciador.listarPedidos();
                        System.out.print("Digite o ID:");
                        try {
                            idRemover = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("ID inválido.");
                            sc.nextLine();
                            idRemover = 0;
                        }
                    } while (idRemover < 0);
                    if (gerenciador.removerPedido(idRemover)) {
                        System.out.println("Pedido removido!");
                    } else
                        System.out.println("Pedido não encontrado.");
                }

                // Inicio da opção do gerenciamento dos pedidos.
            } else if (opcao == 4) {
                int newPedido = 0;
                do {
                    if (gerenciador.pedidoVazioVerif()) {
                    } else {
                        gerenciador.listarPedidos();
                        System.out.print("Pedido a modificar:");
                        try {
                            newPedido = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Pedido inválido.");
                        }
                    }
                } while (newPedido < 0);

                Pedido pedido = gerenciador.buscarPedido(newPedido);

                if (pedido != null) {
                    int opPedido = 0;
                    do {
                        System.out.println("(1) Adicionar item");
                        System.out.println("(2) Avançar status");
                        System.out.println("(3) Voltar");
                        System.out.println();
                        System.out.print("Selecione uma opção: ");
                        try {
                            opPedido = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Opção inválida.");
                            sc.nextLine();
                            opPedido = 0;
                        }
                        if (opPedido == 1) {

                } else {
                    System.out.println("Pedido não encontrado.");
                }
            }
        } while (opcao != 5);
        System.out.println("Saindo...");
    }
}