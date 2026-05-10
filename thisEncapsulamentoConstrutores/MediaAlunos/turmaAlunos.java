package thisEncapsulamentoConstrutores.MediaAlunos;

public class turmaAlunos {
    private String nomeTurma;
    private int quantidadeAlunos;

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

    public void adicionarAluno() {
        quantidadeAlunos++;
        if (quantidadeAlunos > 30) {

        }
    }
}
