package Resumo;


public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    double altura;
    NivelNinja nivel;


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura, NivelNinja nivel) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
        this.nivel = nivel;
    }

    public Ninja() {
    }

    abstract public void HabilidadeEspecial();
}
