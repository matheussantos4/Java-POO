package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.ArrayList;

public class GerenciadorPedidos {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private int contador = 1;

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.printf("PEDIDO Nº:" + pedidos.get(i).getId() + " Mesa " + pedidos.get(i).getMesa() + "%n");
            }
        }
    }

    public boolean removerPedido(int id) {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                if (pedidos.get(i).getId() == id) {
                    pedidos.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void adicionarPedido(Pedido NovoPedido) {
        pedidos.add(NovoPedido);
        NovoPedido.setId(contador);
        contador++;
    }
}
