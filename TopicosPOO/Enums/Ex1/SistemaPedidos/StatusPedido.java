package TopicosPOO.Enums.Ex1.SistemaPedidos;

public enum StatusPedido {
    RECEBIDO(30),
    EM_PREPARO(20),
    PRONTO(5),
    ENTREGUE(0);

    private final int minutos;

    StatusPedido(int minutos) {
        this.minutos = minutos;
    }

    public int tempoEstimado() {
        return minutos;
    }
}

