package TopicosPOO.Enums.Ex1;

public enum StatusPedido {
    RECEBIDO(30),
    EM_PREPARO(20),
    PRONTO(5),
    ENTREGUE(0);

    StatusPedido(int minutos) {
    }
}

