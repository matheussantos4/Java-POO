package Arrays.AgendaDeContatos;

import java.util.Scanner;

public class Ex3main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda MinhaAgenda = new Agenda();

        String opcao;

        // Lendo a opção como String (não int) pra evitar crash do nextInt()
        // quando o usuário digitar uma letra por engano.
        do {
            System.out.println("Adicionar contato(1) Selecionar Contato(2) Sair(3)");
            opcao = sc.nextLine();

            // Valida se a opção digitada é uma das três válidas.
            // Se não for nenhuma das três, cai aqui e avisa o usuário,
            // sem tentar processar nada.
            if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")) {
                System.out.println("Opção inválida.");

            } else if (opcao.equals("1")) {
                String nome, telefone, email;

                // Cada campo tem seu próprio loop de validação: insiste
                // até o usuário digitar algo aceitável, mostrando o motivo
                // do erro a cada tentativa inválida.
                do {
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    if (nome == null || nome.isBlank()) {
                        System.out.println("Nome inválido.");
                    }
                } while (nome == null || nome.isBlank());

                // Telefone precisa ter exatamente 11 dígitos (padrão com DDD).
                do {
                    System.out.print("Telefone: ");
                    telefone = sc.nextLine();
                    if (telefone == null || telefone.isBlank() || telefone.length() != 11) {
                        System.out.println("Telefone inválido.");
                    }
                } while ((telefone == null || telefone.isBlank() || telefone.length() != 11));

                // Email só precisa conter "@" pra ser aceito (validação simples).
                do {
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    if (email == null || !email.contains("@")) {
                        System.out.println("Email inválido.");
                    }
                } while (email == null || !email.contains("@"));

                // Só chega aqui quando os três campos já passaram na validação,
                // então cria o objeto e guarda na agenda.
                Contato c = new Contato(nome, telefone, email);
                MinhaAgenda.adicionarContato(c);
                System.out.println("Contato adicionado!");

            } else if (opcao.equals("2")) {
                // Percorre todos os contatos já cadastrados (do índice 0 até
                // o total atual) e imprime um por um.
                for (int i = 0; i < MinhaAgenda.getTotalContatos(); i++) {
                    Contato c = MinhaAgenda.getContato(i);
                    System.out.println((i + 1) + ". " + c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail());
                }
            }

        } while (!opcao.equals("3")); // repete o menu até o usuário digitar "3"

        System.out.print("Saindo...");
        sc.close();
    }
}