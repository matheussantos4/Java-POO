package thisEncapsulamentoConstrutores.CadastroAcademia;

import java.util.Scanner;

public class SistemaAcademia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura (Em metros): ");
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
        System.out.println("=====================");
        System.out.println("=== Ficha do Aluno ===");
        System.out.println("Nome: " + a1.nome);
        System.out.println("Idade: " + a1.idade + " anos");
        System.out.println("Peso: " + a1.peso + " KG");
        System.out.println("Altura: " + a1.altura + " Metros");
        System.out.println("Plano: " + a1.plano);
        System.out.printf("IMC: %.2f%n", a1.IMC());
        System.out.println("=====================");

        sc.close();
    }
}
