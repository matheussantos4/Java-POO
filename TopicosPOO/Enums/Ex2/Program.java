package TopicosPOO.Enums.Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Order o = new Order();

        /*Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order); */

        String NameClient;
        do {
            System.out.println("Enter client data: ");
            System.out.print("Name: ");
            NameClient = sc.nextLine();
        }
        while (NameClient.isBlank());

        String email;
        do {
            System.out.print("Email: ");
            email = sc.nextLine();
        } while (email.isBlank());

        Date birthDate = null;
        String data;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            System.out.print("Birth date (DD/MM/YYYY): ");
            data = sc.nextLine();

            try {
                birthDate = sdf.parse(data);
            } catch (ParseException e) {
                System.out.println("Data inválida.");
            }
        } while (birthDate == null);


        System.out.println("Enter order data: ");
        OrderStatus status = null;
        do {
            System.out.print("Status: ");
            String texto = sc.nextLine();
            try {
                status = OrderStatus.valueOf(texto.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido.");
            }
        } while (status == null);

        System.out.println("How many itens to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        Date ordDate;
        Client newClient = new Client(NameClient, email, birthDate);
        Order ord = new Order(new Date(), status, newClient);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (int i = 0; i < n; i++) {
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();

            Product newProduct = new Product(pName, price);

            System.out.print("Quantity: ");
            Integer nProd = sc.nextInt();

            OrderItem nO = new OrderItem(newProduct, nProd, price);
            ord.addItem(nO);
            sc.nextLine();
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.print("Order Moment: ");
        System.out.println(sdf2.format(ord.getMoment()));
        System.out.print("Order Status: ");
        System.out.println(status);
        System.out.println("Client: " + NameClient + " (" + data + ") - " + email);
        System.out.println("Order items:");
        ord.allItens();
        System.out.printf("Total price: $ %.2f%n", ord.total());

        sc.close();
    }
}
