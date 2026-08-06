package HerancaPolimorfismo.Ex2;

public class cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "Diz: au au !");
    }
}
