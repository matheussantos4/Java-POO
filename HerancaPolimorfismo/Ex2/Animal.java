package HerancaPolimorfismo.Ex2;

public abstract class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(getNome() + " está comendo.");
    }

    public void respirar() {
        System.out.println(getNome() + " está respirando.");
    }

    public Animal(String nome) {
        setNome(nome);
    }

    public Animal() {
    }
}
