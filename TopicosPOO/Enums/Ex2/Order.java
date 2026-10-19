package TopicosPOO.Enums.Ex2;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;

    private ArrayList<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem e) {
        items.add(e);
    }

    @Override
    public String toString() {
        return "Order{" +
                " moment=" + moment +
                ", status=" + status +
                '}';
    }
}
