package HerancaPolimorfismo.Ex4.src;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int qtdProd = sc.nextInt();

        for (int i = 0; i < qtdProd; i++) {
            int numProd = 0;
            numProd++;
            System.out.println("Product #" + numProd + "data:");
            System.out.println("Common, used or imported (C/U/I) ?");
            char Type = sc.nextLine().charAt(1);

            if (Type == 'C') {

            } else if (Type == 'U') {

            } else if (Type == 'I') {

                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double cfee = sc.nextDouble();
                ImportedProduct newOne = new ImportedProduct(name, price, cfee);
                newOne.totalPrice();
                System.out.println(newOne.priceTag());
            }

        }


        sc.close();
    }
}
