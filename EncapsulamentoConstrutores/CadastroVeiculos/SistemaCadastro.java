package thisEncapsulamentoConstrutores.CadastroVeiculos;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Quilometragem: ");
        Double km = sc.nextDouble();
        System.out.print("KMS Rodados: ");
        int kmRodado = sc.nextInt();
        String tipo, revisao;
        System.out.print("Tipo - 1.Moto 2.Carro ");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            tipo = "Moto";
        } else {
            tipo = "Carro";
        }

        sc.nextLine();

        System.out.print("Dono: ");
        String dono = sc.nextLine();

        if (kmRodado > 1000) {
            revisao = "Sim";
        } else revisao = "Não";

        System.out.print("Revisao necessária: ");

        Veiculos c1 = new Veiculos(modelo, tipo, dono, revisao, ano, km);

        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Tipo: " + c1.tipo);
        System.out.println("Ano: " + c1.ano);
        System.out.println("Quilometragem: " + c1.km + " KM");
        System.out.println("Dono: " + c1.dono);
        System.out.println("Revisao necessária : " + c1.revisao);
        System.out.println("========================");

        sc.close();
    }
}


