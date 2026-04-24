package thisEncapsulamentoConstrutores.sistemaAcademia;

import java.util.Scanner;

public class sistemaAcademia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.print("Plano - 1.Básico 2.Premium ");
        int opcao = sc.nextInt();
        String plano;
        if (opcao == 1) {
            plano = "Básico";
        } else {
            plano = "Premium";
        }

        Aluno a1 = new Aluno(nome, plano, idade, peso, altura);
        System.out.println("=== Ficha do Aluno ===");
        System.out.println("Nome: " + a1.nome);
        System.out.println("Idade: " + a1.idade + "");
        System.out.println("Peso: " + a1.peso);
        System.out.println("Altura: " + a1.altura);
        System.out.println("Plano: " + a1.plano);


        sc.close();
    }
}
