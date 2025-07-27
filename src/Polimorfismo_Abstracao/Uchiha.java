package Polimorfismo_Abstracao;

public class Uchiha  extends Ninja{


    public Uchiha() {
        super(); // Você está referenciando atributos da SUPERCLASSE

    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); // Você está referenciando atributos da SUPERCLASSE
    }

    // Sobrescrever o metodo da classe NINJA !
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+nome+" e esse é meu ataque Uchiha !");
    }



}
