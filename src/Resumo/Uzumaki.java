package Resumo;

public class Uzumaki extends Ninja{
    Biju biju;


    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura, NivelNinja nivel) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura, nivel);
    }


    // SOBRECARGA DE CONSTRUTOR
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura, NivelNinja nivel, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, altura, nivel);
        this.biju = biju;
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Meu nome: "+nome+" sou um uzumaki, essa é minha habilidade especial: Resistencia");
    }
}
