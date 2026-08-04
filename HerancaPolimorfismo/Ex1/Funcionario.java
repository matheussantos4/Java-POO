package HerancaPolimorfismo.Ex1;

public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("Salário: " + getSalario());
        System.out.println("Nome: " + getNome());
    }

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public Funcionario() {
        
    }
}


