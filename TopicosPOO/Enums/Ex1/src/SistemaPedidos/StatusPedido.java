package TopicosPOO.Enums.Ex1.src.SistemaPedidos;

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

    public StatusPedido proximo() {
        switch (this) {
            case RECEBIDO:
                return EM_PREPARO;
            case EM_PREPARO:
                return PRONTO;
            case PRONTO:
                return ENTREGUE;
        }
        return this;

    }
}

