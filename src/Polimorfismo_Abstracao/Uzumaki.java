package Polimorfismo_Abstracao;

public class Uzumaki extends Ninja{



    // TODO: Sobrecarga de Construtores na sub classe uzumaki.
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Sobrescrever o metodo da classe NINJA !
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque uzumaki, eu já completei:"+numeroDeMissoesConcluidas+" Missôes");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Esse é meu nome: "+nome+" essa é minha estrategia ninja UZUMAKI");
    }
}
