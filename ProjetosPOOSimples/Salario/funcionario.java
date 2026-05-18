package ProjetosPOO.Salario;

public class funcionario {

    String name;
    double GrossSalary, Tax, percentage;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void increaseSalary() {
        GrossSalary += GrossSalary * percentage / 100;
    }
}