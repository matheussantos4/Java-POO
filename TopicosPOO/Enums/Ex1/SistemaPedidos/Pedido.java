package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private int contador, ID, mesa;

    public void adicionarItem(ItemPedido ItemPedido) {
        itens.add(ItemPedido);
    }

    public Pedido(int ID, int mesa) {
        this.ID = ID;
        this.mesa = mesa;
    }
}
