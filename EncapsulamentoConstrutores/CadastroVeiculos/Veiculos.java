package thisEncapsulamentoConstrutores.CadastroVeiculos;

public class Veiculos {

    String modelo, tipo, dono, revisao;
    int ano;
    Double km;

    public Veiculos(String modelo, String tipo, String dono, String revisao, int ano, Double km) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.dono = dono;
        this.ano = ano;
        this.km = km;
        this.revisao = revisao;
    }
}
