package TopicosPOO.Enums.Ex2;

import java.util.Scanner;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order); */

        String NameClient;
        do {
            System.out.print("Enter client data: ");
            NameClient = sc.nextLine();
        }
        while (NameClient.isBlank());

        String email;
        do {
            System.out.print("Email: ");
            email = sc.nextLine();
        } while (email.isBlank());
        */
        Date birthDate;
        String data;
        do {
            System.out.print("Birth date (DD/MM/YYYY): ");
            data = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
            try {
                birthDate = sdf.parse(data);
            } catch (ParseException e) {
                System.out.println("Data inválida.");
                sc.nextLine();
            }

        } while (data.isBlank());

        sc.close();
    }
}
