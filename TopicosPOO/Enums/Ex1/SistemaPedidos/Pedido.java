package TopicosPOO.Enums.Ex1.SistemaPedidos;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens = new ArrayList<>();
    private int id, mesa;
    private StatusPedido status;

    public void adicionarItem(ItemPedido itemAdicionar) {
        itens.add(itemAdicionar);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).subTotal();
        }
        return total;
    }

    public Pedido(int id, int mesa) {
        this.id = id;
        this.mesa = mesa;
        this.status = StatusPedido.RECEBIDO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
