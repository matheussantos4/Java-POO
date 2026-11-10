package HerancaPolimorfismo.Ex4.src;

import HerancaPolimorfismo.Ex4.entities.ImportedProduct;
import HerancaPolimorfismo.Ex4.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int qtdProd = sc.nextInt();

        for (int i = 0; i < qtdProd; i++) {
            int numProd = 0;
            numProd++;
            System.out.println("Product #" + numProd + " data:");
            System.out.print("Common, used or imported (C/U/I) ? ");
            char Type = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            String name;
            Double price;

            if (Type == 'C') {

            } else if (Type == 'U') {
                Date prodDate = null;
                String date;
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Price: ");
                price = sc.nextDouble();
                System.out.print("Manufacture Date: ");
                sc.nextLine();
                date = sc.nextLine();
                SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
                prodDate = sfd.parse(date);
                UsedProduct newOne = new UsedProduct(name, price, prodDate);
                System.out.println(newOne.priceTag());

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
