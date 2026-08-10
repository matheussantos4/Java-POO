package HerancaPolimorfismo.Ex3;

public class Moto extends Veiculo {

    // Metodo apenas para calcular imposto.
    @Override
    public double calcularImposto() {
        return (getPreco() * 0.02);
    }

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }
}
