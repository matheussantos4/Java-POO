package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(StatusPedido.PRONTO.tempoEstimado());
    }
}