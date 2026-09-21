package TopicosPOO.Enums.Ex1.SistemaPedidos;

public class ItemPedido {
    private String nome;
    private int Quantd;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantd() {
        return Quantd;
    }

    public void setQuantd(int quantd) {
        Quantd = quantd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double subTotal() {
        return Quantd * preco;
    }

    public ItemPedido(String nome, int Quantd, double preco) {
        this.nome = nome;
        this.Quantd = Quantd;
        this.preco = preco;
    }
}
