package EncapsulamentoConstrutores.MediaAlunos;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {

        } else this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public double getNota() {
        return nota;
    }

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
}
