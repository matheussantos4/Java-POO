package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.ArrayList;

public class GerenciadorPedidos {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int contador = 1;

    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.printf("PEDIDO Nº: " + pedidos.get(i).getId() + "%n");
        }
    }

    public void adicionarPedido(Pedido NovoPedido) {
        pedidos.add(NovoPedido);
        NovoPedido.setId(contador);
        contador++;
    }
}
