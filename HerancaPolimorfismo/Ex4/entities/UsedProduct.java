package HerancaPolimorfismo.Ex4.entities;

import java.util.Date;

public class UsedProduct extends Product {

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDates = manufactureDate;
    }

    private Date manufactureDates;

    public Date getManufactureDate() {
        return manufactureDates;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDates = manufactureDate;

    }
}


