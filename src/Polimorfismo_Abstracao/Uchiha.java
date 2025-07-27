package Polimorfismo_Abstracao;

public class Uchiha  extends Ninja{


    public Uchiha() {
        super(); // Você está referenciando atributos da SUPERCLASSE

    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); // Você está referenciando atributos da SUPERCLASSE
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);// InteliJ já faz automaticamente em subclasses
    }

    // Sobrescrever o metodo da classe NINJA !
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha, eu já completei:"+numeroDeMissoesConcluidas+" Missôes");
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


}
