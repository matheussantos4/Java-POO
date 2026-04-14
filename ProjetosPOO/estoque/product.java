package ProjetosPOO.estoque;

public class product {

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

}
