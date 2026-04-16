package ProjetosPOO.Salario;

public class funcionario {

    String nome;
    double salary, Tax, percentage;

    public double NetSalary() {
        return salary - Tax;
    }

    public void increaseSalary() {
        salary += salary * percentage / 100;
    }
}