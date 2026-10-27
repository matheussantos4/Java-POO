package TopicosPOO.Enums.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorProd, Pagamento;
        valorProd = 400;
        Pagamento = sc.nextDouble();

        StatusPedido status = StatusPedido.PENDENTE;
        if (valorProd == Pagamento) {
            status = StatusPedido.PREPARANDO;
        }
        System.out.println(status);
        sc.close();
    }
}
