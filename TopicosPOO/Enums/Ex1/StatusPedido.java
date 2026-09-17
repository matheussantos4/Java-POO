package TopicosPOO.Enums.Ex1;

public enum StatusPedido {
    RECEBIDO(30),
    EM_PREPARO(20),
    PRONTO(5),
    ENTREGUE(0);

    private final int minutos;

    StatusPedido(int minutos) {
        this.minutos = minutos;
    }
}

