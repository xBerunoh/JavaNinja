package Resumo;

public class Uzumaki extends Ninja{
    Bijus bijus;


    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura, NivelNinja nivel) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura, nivel);
    }


    // SOBRECARGA DE CONSTRUTOR
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura, NivelNinja nivel, Bijus bijus) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura, nivel);
        this.bijus = bijus;
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Meu nome: "+nome+" sou um uzumaki, essa é minha habilidade especial: Resistencia");
    }
}
