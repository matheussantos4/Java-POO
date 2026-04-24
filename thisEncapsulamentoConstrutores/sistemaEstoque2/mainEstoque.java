package thisEncapsulamentoConstrutores.sistemaEstoque2;

import java.util.Locale;
import java.util.Scanner;

public class mainEstoque {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // coleta os dados do produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.print("Product data:" + product); // toString() da classe sendo chamado aqui
        System.out.println();

        // adiciona ao estoque
        System.out.println("Enter the number of products to be added in stock: ");
        int quantitiy = sc.nextInt();
        product.addProduct(quantitiy);

        System.out.println();
        System.out.print("Product data:" + product);

        // remove do estoque
        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantitiy = sc.nextInt();
        product.removeProduct(quantitiy);

        sc.close();

    }

}
