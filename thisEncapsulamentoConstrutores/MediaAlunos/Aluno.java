package thisEncapsulamentoConstrutores.MediaAlunos;

public class Aluno {

    private String nome;
    private int matricula;
    private double nota;
    private int alunos = 0;
    int turma;

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public int getMatricula() {
        return matricula + turma;
    }

    public double getNota() {
        return nota;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {

        } else this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        if (String.valueOf(matricula).length() != 11) {

        } else this.matricula = matricula;
        if (matricula > 30) {

        }
    }

    public void adicionarAluno(String nome, double nota) {
        turma++;
        this.nome = nome;
        this.matricula = turma;
        this.nota = nota;
    }

    public Aluno() {

    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }
}
