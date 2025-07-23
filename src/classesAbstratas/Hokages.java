package classesAbstratas;

public abstract class Hokages {
    // ATRIBUTOS
    String nome;
    int idade;
    boolean vivoOunao;


    public abstract void sabedoriaHokage(); // método abstrato
    public Hokages(String nome, int idade, boolean vivoOunao) {

        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;

    }

    public Hokages() {

    }
}
