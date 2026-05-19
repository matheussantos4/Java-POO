package Arrays.AgendaDeContatos;

public class Contato {

    private String nome, telefone, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
        } else this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {

        } else this.email = email;
    }

    public Contato(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }
}