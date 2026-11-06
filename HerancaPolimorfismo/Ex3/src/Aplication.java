package HerancaPolimorfismo.Ex3.src;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of emplyess: ");
        int numEmp = sc.nextInt();
        int cont = 0;

        do {
            cont++;
            System.out.println("Employee #" + numEmp + "data");
            System.out.print("Outsourced ? (y/n) ");
            

        } while (numEmp != cont);

        
        sc.close();
    }
}
