package HerancaPolimorfismo.Ex3;

public class Carro extends Veiculo {

    @Override
    public double calcularImposto() {
        return (getPreco() * 0.04);
    }

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }
}
