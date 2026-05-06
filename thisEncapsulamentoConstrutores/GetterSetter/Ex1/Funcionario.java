package thisEncapsulamentoConstrutores.GetterSetter.Ex1;

public class Funcionario {

    private String nome;
    private double salario;
    private Long cpf;

    private static int contadorID = 0;
    private int Id;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public double getsalario() {
        return this.salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public void setcpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getcpf() {
        return this.cpf;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return this.Id;
    }

    public Funcionario(String nome, double salario, Long cpf) {
        contadorID++;
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
        this.Id = contadorID;
    }

    public void setnewsalario() {
        this.salario = salario + 0.10 * salario;
    }
}