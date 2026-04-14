package ProjetosPOO.estoque;

import java.util.Locale;
import java.util.Scanner;
import ProjetosPOO.estoque.product;

public class mainEstoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        product product = new product();

        System.out.println("Digite o nome do produto:");

        sc.close();

    }

}
