package Arrays.AgendaDeContatos;

public class Agenda {

    private String nomeAgenda;
    private int totalContatos;

    private Contato[] listaContatos = new Contato[50];

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        if (nomeAgenda == null || nomeAgenda.isBlank()) {

        } else this.nomeAgenda = nomeAgenda;
    }

    public int getTotalContatos() {
        return totalContatos;
    }

    public void setTotalContatos(int totalContatos) {
        this.totalContatos = totalContatos;
    }
}
