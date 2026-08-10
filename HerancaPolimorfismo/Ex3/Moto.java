package HerancaPolimorfismo.Ex3;

public class Moto extends Veiculo {

    @Override
    public double calcularImposto() {
        return (getPreco() * 0.02);
    }

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }
}
