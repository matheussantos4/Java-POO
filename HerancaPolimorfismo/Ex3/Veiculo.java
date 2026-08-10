package HerancaPolimorfismo.Ex3;

public abstract class Veiculo {

    private String modelo, placa;
    private int ano;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

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

    public abstract double calcularImposto();

    public Veiculo(String modelo, int ano) {
        setAno(ano);
        setModelo(modelo);
    }

    public Veiculo() {

    }
}
