package Polimorfismo_Abstracao;

public abstract class Ninja implements estrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    nivelNinja rank;
    final double altura = 2.10;

    // `t o d o ` : Para alerta sobre algo que foi feito ! opção de nevagação !
    //TODO: Incluir 2 novos atributos : NumeroDeMissaoConcluido , Rank
    // TODO: RANK: Gennin , Chunnin , Jounnin, Hokage




    // Construtor Padrão
    public Ninja() {
    }
    // Construtor "ALl args"
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    // TODO: Sobrecarga de construtores, chamandos novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, nivelNinja rank) {
        this(nome,aldeia,idade); // sobrecarga de construtores - referencia de todos
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
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


    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+nome+" Essa é minha INTELIGENCIA de combate !");

    }

    // Sobrecarga de metodos


    public void inteligenciaDeCombate(int qi) {
        if(qi > 100){
            System.out.println("Seu QI é:"+qi+" Você é um genio");
        }else if (qi >= 130){
            System.out.println("Seu QI é:"+qi+" Você é um Ninja Promissor");
        }else{
            System.out.println("Seu QI é:"+qi+" Você precisa treinar mais suas estrategias !");
        }
    }
    // TODO NINJA VAI FAZER ESSE METODO
    final void tacarKunai(){
        System.out.println("Eu sou um método da classe mãe !");
        // metodo FINAL = CONSTANTE, NÃO PODE SER MUDADO, ESSE METODO NÃO PODE SER SOBSCRITO
    }




}


