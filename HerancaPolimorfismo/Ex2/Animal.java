package HerancaPolimorfismo.Ex2;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    public void respirar() {
        System.out.println(getNome() + " está respirando.");
    }

    public void emitirSom() {
        System.out.println(getNome() + "...");
    }

    public Animal(String nome) {
        setNome(nome);
    }

    public Animal() {
    }
}
