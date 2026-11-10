package HerancaPolimorfismo.Ex4.entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customsFee = customFee;
    }

    @Override
    public String priceTag() {
        return super.getName() + " $ " + String.format("%.2f ", super.getPrice());
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}
