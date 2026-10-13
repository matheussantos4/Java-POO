package TopicosPOO.Enums.Ex2;

public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int Opcoes = 0;

    OrderStatus(int Opcoes) {
    }
}
