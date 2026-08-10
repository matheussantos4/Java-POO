package HerancaPolimorfismo.Ex3;

public class Carro extends Veiculo implements Financiavel {

    @Override
    public void simularFinanciamento(int parcelas) {
        System.out.println("parcelamento");
    }

    // Metodo apenas para calcular imposto.
    @Override
    public double calcularImposto() {
        return (getPreco() * 0.04);
    }

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }
}
