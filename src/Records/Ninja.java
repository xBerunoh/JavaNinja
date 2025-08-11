package Records;

public class Ninja {
    private final String nome;
    private final int numero;
    private final String email;

    public Ninja(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", email='" + email + '\'' +
                '}';
    }
}
