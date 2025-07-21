package Desafio04;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;
    tipoHabilidade tipoHabilidade;

   @Override
    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja "+nome);
        System.out.println("Idade do Ninja "+idade);
        System.out.println("Habilidade do Ninja "+habilidade);
       System.out.println("Tipo de Habilidade: "+tipoHabilidade);


   }
   @Override
    public void executarHabilidade(){
       System.out.println("Eu sou um ninja , soltarei minha habilidade: "+habilidade);
    }

    public NinjaBasico(String nome, int idade, String habilidade,tipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico() {
    }
}

