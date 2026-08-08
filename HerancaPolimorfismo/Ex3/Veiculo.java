package HerancaPolimorfismo.Ex3;

public abstract class Veiculo {

    private String modelo, placa;
    private int ano;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract double calcularImposto(int Valor);

    public Veiculo(String modelo, int ano) {
        setAno(ano);
        setModelo(modelo);
    }

    public Veiculo() {

    }
}
