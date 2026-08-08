package HerancaPolimorfismo.Ex3;

public class Moto extends Veiculo {

    @Override
    public double calcularImposto(int Valor) {
        return Valor * 0.02;
    }
}
