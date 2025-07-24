package Polimorfismo_Abstracao;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;


    // Metodo Geral - Todos os ninjas vão ter !
    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+nome+ " esse é meu ataque especial!");
    }
}
