package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pedido n1 = new Pedido(1, 12);
        int id = sc.nextInt();
        int mesa = sc.nextInt();
        Pedido n2 = new Pedido(id, mesa);
        System.out.println(StatusPedido.PRONTO.tempoEstimado());
        

    }
}