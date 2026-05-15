package EncapsulamentoConstrutores.MediaAlunos;

import java.util.Scanner;

public class ex2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        turmaAlunos turma1 = new turmaAlunos("JavaPOO");

        Aluno a1 = new Aluno("Matheus", 8.4);
        turma1.adicionarAluno(a1);

        System.out.println("--- Sistema de Gestão Acadêmica ---");
        System.out.println("Status: Aluno " + a1.getNome() + " adicionado com sucesso a turma " + turma1.getNomeTurma());
        System.out.println("Matricula do aluno: " + a1.getMatricula());
        System.out.println("Nota final: " + a1.getNota());
        System.out.println("Total de alunos na turma: " + turma1.getQuantidadeAlunos());

        Aluno a2 = new Aluno("Maria", 9.0);
        turma1.adicionarAluno(a1);
        Aluno a3 = new Aluno("João", 7.0);
        turma1.adicionarAluno(a1);

        System.out.println("Total de alunos na turma: " + turma1.getQuantidadeAlunos());

        System.out.println("Matricula do aluno: " + a2.getMatricula());

        sc.close();

    }
}
