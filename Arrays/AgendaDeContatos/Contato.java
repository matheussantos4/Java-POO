package Arrays.AgendaDeContatos;

public class Contato {

    private String nome, telefone, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.length() == 11) {
            boolean apenasNumeros = true;

            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    apenasNumeros = false;
                    break;
                }
            }

            if (apenasNumeros) {
                this.telefone = telefone;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    public Contato(String nome, String telefone, String email) {
        setNome(nome);
        setEmail(email);
    }
}