package HerancaPolimorfismo.Ex3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Veiculo c1 = new Carro("Monza", 1999);
        Veiculo m1 = new Moto("Cg160", 2025);

        System.out.println("---------------Calcular imposto---------------");
        System.out.print("Digite o valor do carro: ");
        c1.setPreco(sc.nextDouble());
        double precoC = c1.calcularImposto() + c1.getPreco();
        System.out.println("Valor com impostos: " + precoC);
        System.out.print("Digite o valor da moto: ");
        m1.setPreco(sc.nextDouble());
        double precoM = m1.calcularImposto() + m1.getPreco();
        System.out.println("Valor com impostos: " + precoM);
    }
}
