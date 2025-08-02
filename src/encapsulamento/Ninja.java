package encapsulamento;

public abstract class Ninja {
    // box 1
    private String nome;
    String aldeia;
    int idade;
    int numerosDeMissoesConcluidas;
    double altura = 2.10;

    // box 2
    // Tirar dados ou mostrar para o usuário eu uso o GET + NOME DA VARIAVEL.
    public String getNome(){
        return nome;
    };

    // box 3
    // Setters recebem valores
    public void setNome(String nome){
      this.nome = nome;
    };

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumerosDeMissoesConcluidas() {
        return numerosDeMissoesConcluidas;
    }

    public void setNumerosDeMissoesConcluidas(int numerosDeMissoesConcluidas) {
        this.numerosDeMissoesConcluidas = numerosDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
