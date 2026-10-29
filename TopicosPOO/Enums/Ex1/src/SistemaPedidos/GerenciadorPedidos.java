package TopicosPOO.Enums.Ex1.src.SistemaPedidos;

import TopicosPOO.Enums.Ex2.Product;

import java.util.ArrayList;

public class GerenciadorPedidos {

    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    private int contador = 1;

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.printf("Nº:" + pedido.getId() + " Mesa " + pedido.getMesa() + " " + pedido.getStatus() + "%n");
            }
        }
    }

    public boolean removerPedido(int id) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId() == id) {
                pedidos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean pedidoVazioVerif() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos.");
            return true;
        }
        return false;
    }

    public Pedido buscarPedido(int ID) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == ID) {
                return pedido;
            }
        }
        return null;
    }

    public void adicionarPedido(Pedido NovoPedido) {
        pedidos.add(NovoPedido);
        NovoPedido.setId(contador);
        contador++;
    }

    public boolean verificarDuplicata(Pedido pedidoNovo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getMesa() == pedidoNovo.getMesa()) {
                System.out.println("Mesa ocupada.");
                return true;
            }
        }
        return false;
    }
}



