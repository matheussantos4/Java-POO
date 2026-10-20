package TopicosPOO.Enums.Ex2;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal() {
        return price * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return
                product.getName() + ", " +
                        "Quantity: " + quantity +
                        ", Price: $" + price + " Subtotal: " + "$" + subTotal();

    }

    public OrderItem(Product product, Integer quantity, double price) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
}
