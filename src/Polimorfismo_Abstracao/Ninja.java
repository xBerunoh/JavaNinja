package Polimorfismo_Abstracao;

public abstract class Ninja implements estrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;


    // Metodo Geral - Todos os ninjas vão ter !
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+nome+ " esse é meu ataque especial!");


    }

    // Sobrescrevendo o metodo da INTERFACE
    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estrategia de combate !");
    }

    // Sobrescrevendo o metodo da INTERFACE
    @Override
    public void estrategiaDeCombate() {
        System.out.println("Meu nome: "+nome+ " essa é minha estrategia Ninja");
    }
}


