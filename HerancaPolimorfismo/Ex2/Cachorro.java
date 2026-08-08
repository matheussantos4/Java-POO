package HerancaPolimorfismo.Ex2;

public class Cachorro extends Animal {

    // Override tem como função sobrescrever uma função estabelecida na classe mãe.
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }

    public Cachorro(String nome) {
        // Super tem como função chamar o construtor da classe mãe.
        super(nome);
    }
}
