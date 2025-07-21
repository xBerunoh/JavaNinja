package Construtores;

public class Hokages {
    // ATRIBUTOS
    String nome;
    int idade;
    boolean vivoOunao;

// Você consegue criar automaticamente os construtores com o GENERETA : (CTRL + N) SHORT CUTS
    public Hokages(String nome, int idade, boolean vivoOunao) {
        // `all - args`
        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
    }

    public Hokages() {
        // `No - args`
    }
}
