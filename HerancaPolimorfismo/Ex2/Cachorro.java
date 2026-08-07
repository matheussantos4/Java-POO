package HerancaPolimorfismo.Ex2;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }

    public Cachorro(String nome) {
        super(nome);
    }
}
