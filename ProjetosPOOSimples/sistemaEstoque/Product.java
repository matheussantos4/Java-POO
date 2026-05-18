package ProjetosPOO.sistemaEstoque;

public class Product {

    public String name;
    public Double price;
    public int quantity = 0;

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
