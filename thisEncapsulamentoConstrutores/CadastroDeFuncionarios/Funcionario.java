package thisEncapsulamentoConstrutores.CadastroDeFuncionarios;

public class Funcionario {

    private String nome;
    private double salario;
    private Long cpf;

    private static int contadorID = 0;
    private int Id;

    public void setnome(String nome) {
        if (nome == null || nome.isBlank()) {

        } else this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public void setsalario(double salario) {
        if (salario < 1874 || salario > 3200) {

        } else this.salario = salario;
    }

    public double getsalario() {
        return this.salario;
    }

    public void setcpf(Long cpf) {
        if (String.valueOf(cpf).length() != 11) {

        } else this.cpf = cpf;
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

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void setnewsalario() {
        this.salario = salario + 0.10 * salario;
    }
}