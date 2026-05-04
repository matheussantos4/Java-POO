package thisEncapsulamentoConstrutores.sistemaEstoque2;

public class Product {

    private String name;
    private Double price;
    private int quantity = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double totalValue() {

        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantitiy) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValue());

    }

}
