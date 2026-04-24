package thisEncapsulamentoConstrutores.sistemaAcademia;

public class Aluno {

    String nome, plano;
    int idade;
    double peso, altura;

    public double IMC() {
        return peso / (altura * altura);
    }

    public Aluno(String nome, String plano, int idade, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.plano = plano;
    }
}
