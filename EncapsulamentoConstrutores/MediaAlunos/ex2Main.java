package EncapsulamentoConstrutores.MediaAlunos;

import java.util.Scanner;

public class ex2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        turmaAlunos turma1 = new turmaAlunos();

        Aluno a1 = new Aluno("Matheus", 12, 8.4);
        turma1.adicionarAluno(a1);

        System.out.println(a1.getNome() + a1.getMatricula() + a1.getNota());

        turma1.getQuantidadeAlunos();


    }
}
