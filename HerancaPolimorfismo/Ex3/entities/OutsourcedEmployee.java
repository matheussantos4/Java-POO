package HerancaPolimorfismo.Ex3.entities;

public class OutsourcedEmployee extends Employee {
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    private void additionalCharge() {
    }
}
