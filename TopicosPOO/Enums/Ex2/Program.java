package TopicosPOO.Enums.Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
        do {
            System.out.print("Birth date (DD/MM/YYYY): ");
            data = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
        int quantity = sc.nextInt();


        sc.close();
    }
}
