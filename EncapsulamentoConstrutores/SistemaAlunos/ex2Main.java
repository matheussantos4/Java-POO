package EncapsulamentoConstrutores.SistemaAlunos;

import java.util.Scanner;

public class ex2Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //criação de turma a partir da classe turmaAlunos
        turmaAlunos turma1 = new turmaAlunos("JavaPOO");

        //criação de aluno a partir da classe Aluno
        Aluno a1 = new Aluno("Matheus", 5);
        turma1.adicionarAluno(a1);
        Aluno a2 = new Aluno("Maria", 4);
        turma1.adicionarAluno(a2);
        Aluno a3 = new Aluno("João", -5);
        turma1.adicionarAluno(a3);

        System.out.println("--- Sistema de Gestão Acadêmica ---");
        System.out.println("Matricula: " + a1.getMatricula() + " | " + "Nome: " + a1.getNome() +
                " | " + "Nota: " + a1.getNota() + " | " + "Situação: " + a1.getSituacao());
        System.out.println("Matricula: " + a2.getMatricula() + " | " + "Nome: " + a2.getNome() +
                " | " + "Nota: " + a2.getNota() + " | " + "Situação: " + a2.getSituacao());
        System.out.println("Matricula: " + a3.getMatricula() + " | " + "Nome: " + a3.getNome() +
                " | " + "Nota: " + a3.getNota() + " | " + "Situação: " + a3.getSituacao());


        /*metodo acima utiliza do adicionarAluno, função que soma
        alunos dentro de uma turma e ao mesmo tempo realiza a
        contagem de sua matricula (décimo terceiro aluno =
        13 matricula.*/

        System.out.println("Total de alunos na turma: " + turma1.getQuantidadeAlunos());

        sc.close();

    }
}
