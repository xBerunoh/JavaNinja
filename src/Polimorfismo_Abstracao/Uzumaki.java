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

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+nome+" Essa é minha INTELIGENCIA de combate !");

    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if(qi > 100){
            System.out.println("Seu QI é:"+qi+" Você é um genio");
        }else if (qi >= 130){
            System.out.println("Seu QI é:"+qi+" Você é um Ninja Promissor");
        }else{
            System.out.println("Seu QI é:"+qi+" Você precisa treinar mais suas estrategias !");
        }
    }

    @Override
    public String toString() {
        return "Meu nome é"+nome+" Eu sou da"+aldeia;
    }
}
