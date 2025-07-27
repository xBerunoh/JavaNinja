package Polimorfismo_Abstracao;

public abstract class Ninja implements estrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;

    // `t o d o ` : Para alerta sobre algo que foi feito ! opção de nevagação !
    //TODO: Incluir 2 novos atributos : NumeroDeMissaoConcluido , Rank


    // Construtor Padrão
    public Ninja() {
    }
    // Construtor "ALl args"
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

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


