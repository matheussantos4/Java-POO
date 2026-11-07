package HerancaPolimorfismo.Ex3.src;

import HerancaPolimorfismo.Ex3.entities.Employee;
import HerancaPolimorfismo.Ex3.entities.OutsourcedEmployee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employess: ");
        int numEmp = sc.nextInt();
        int cont = 0;
        char op;

        for (int i = 0; i < numEmp; i++) {
            String name;
            Integer hours;
            double vlpHour;
            cont++;

            System.out.println("Employee #" + cont + " data");
            System.out.print("Outsourced ? (y/n) ");
            op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            vlpHour = sc.nextInt();

            try {

            } catch (InputMismatchException e) {

            }
            if (op == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                OutsourcedEmployee newOne = new OutsourcedEmployee(name, hours, vlpHour);
                Employee.addEmp(newOne);
                newOne.additionalCharge(charge);

            } else if (op == 'n') {
                OutsourcedEmployee newOne = new OutsourcedEmployee(name, hours, vlpHour);
                Employee.addEmp(newOne);
                newOne.payment();
            }
        }

        Employee.listTotal();

        sc.close();
    }
}
