package Arrays.AgendaDeContatos;

import java.util.Scanner;

public class Ex3main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda MinhaAgenda = new Agenda();

        int opcao;

        do {
            System.out.println("Adicionar contato(1) Selecionar Contato(2) Sair(3)");
            opcao = sc.nextLine();
            if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")) {
                System.out.println("Opção inválida.");
            } else if (opcao.equals("1")) {
                String nome, telefone, email;
                do {
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    if (nome == null || nome.isBlank()) {
                        System.out.println("Nome inválido.");
                    }
                } while (nome == null || nome.isBlank());

                do {
                    System.out.print("Telefone: ");
                    telefone = sc.nextLine();
                    if (telefone == null || telefone.isBlank() || telefone.length() != 11) {
                        System.out.println("Telefone inválido.");
                    }
                } while ((telefone == null || telefone.isBlank() || telefone.length() != 11));

                do {
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    if (email == null || !email.contains("@")) {
                        System.out.println("Email inválido.");
                    }

                } while (email == null || !email.contains("@"));

                Contato c = new Contato(nome, email, telefone);
                MinhaAgenda.adicionarContato(c);
                System.out.println("Contato adicionado!");
            } else if (opcao == 2) {
                for (int i = 0; i < MinhaAgenda.getTotalContatos(); i++) {
                    Contato c = MinhaAgenda.getContato(i);
                    System.out.println((i + 1) + ". " + c.getNome() + " | " + c.getTelefone() + " | " + c.getEmail());
                }
            } else System.out.print("Saindo...");

        } while (opcao != 3);

        /*do {
            System.out.println("Nome: ");


        } while (c1.getNome() == null || c1.getNome().isBlank());

        MinhaAgenda.adicionarContato(c1);
        System.out.println(c1.getEmail());*/

    }
}
 