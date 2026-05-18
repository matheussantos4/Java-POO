package thisEncapsulamentoConstrutores.MediaAlunos;

public class turmaAlunos {
    private String nomeTurma;
    private int quantidadeAlunos = 0;

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos > 30) {

        }
        quantidadeAlunos++;
    }

    public turmaAlunos() {

    }

    public turmaAlunos(String nomeTurma) {
        this.nomeTurma = nomeTurma;

    }
}
