package HerancaPolimorfismo.Ex1;

public class Gato extends Animal {

    // Override tem como função sobrescrever uma função estabelecida na classe mãe.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau Miau!");
    }

    public Gato(String nome) {
        // Super tem como função chamar o construtor da classe mãe.
        super(nome);
    }
}
