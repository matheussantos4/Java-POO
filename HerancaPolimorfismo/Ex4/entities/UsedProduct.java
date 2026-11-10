package HerancaPolimorfismo.Ex4.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDates;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDates = manufactureDate;
    }

    SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String priceTag() {
        return super.getName() + " (used) $" + super.getPrice() + " Manufacture date: " + sfd.format(manufactureDates);
    }

    public Date getManufactureDate() {
        return manufactureDates;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDates = manufactureDate;
    }
}


