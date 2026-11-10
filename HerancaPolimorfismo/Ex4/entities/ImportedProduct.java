package HerancaPolimorfismo.Ex4.entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}
