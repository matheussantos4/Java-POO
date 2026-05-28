package Arrays.AgendaDeContatos;

import java.util.Scanner;

public class Ex3main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda MinhaAgenda = new Agenda();

        Contato c1 = new Contato("Bruno", "11999999999", "brunoburghi@gmail.com");

        do {
            System.out.println("Nome: ");
            c1.getNome();

        } while (c1.getNome() == null);


        MinhaAgenda.adicionarContato(c1);

        System.out.println(c1.getEmail());
        System.out.println();

    }
}
 