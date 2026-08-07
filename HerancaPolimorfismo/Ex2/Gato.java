package HerancaPolimorfismo.Ex2;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau Miau!");
    }

    public Gato(String nome) {
        super(nome);
    }
}
