package HerancaPolimorfismo.Ex3;

public class Carro extends Veiculo {

    @Override
    public double calcularImposto(int Valor) {
        return Valor * 0.04;
    }
}
