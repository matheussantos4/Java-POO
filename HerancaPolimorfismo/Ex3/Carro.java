package HerancaPolimorfismo.Ex3;

public class Carro extends Veiculo {

    @Override
    public double calcularImposto(int Valor) {
        double precoReal = Valor;
        return precoReal * 0.04;
    }
}
