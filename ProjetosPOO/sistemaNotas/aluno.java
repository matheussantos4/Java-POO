package ProjetosPOO.sistemaNotas;

public class aluno {

    String nome;
    double not1, not2, not3;

    public double soma() {
        return not1 + not2 + not3;
    }

    public double falta() {
        return 60 - soma();
    }

}
