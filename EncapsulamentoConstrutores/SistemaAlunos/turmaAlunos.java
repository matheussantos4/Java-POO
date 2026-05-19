package EncapsulamentoConstrutores.SistemaAlunos;

public class turmaAlunos {
    private String nomeTurma;
    private int quantidadeAlunos = 0;

    //Array do tipo Aluno (Classe Aluno com nome matrícula e nota)
    //com limite de 30 índices, representando a capacidade da turma.
    private Aluno[] ListaAlunos = new Aluno[30];

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

    //Utilização de array para quantificar os alunos por turma.

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < 30) {

            int novaMatricula = quantidadeAlunos + 1;
            aluno.setMatricula(novaMatricula);
            ListaAlunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;

        } else System.out.println("Erro: A turma " + nomeTurma + " já está cheia!");

        /* Se a quantidade de alunos for abaixo de 30, pegue o Array ListaAlunos, utilize
        como parâmetro o contador quantidadeAlunos e por fim receba a variável aluno, na
        qual o tipo é a própria classe Aluno que existe a parte.
         */
    }

    public turmaAlunos() {

    }

    public turmaAlunos(String nomeTurma) {
        this.nomeTurma = nomeTurma;

    }
}
