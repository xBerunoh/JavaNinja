package Desafio02;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

   public void mostrarHabilidadeEspecial(){
       System.out.println(habilidadeEspecial);
   }

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: "+nome);
        System.out.println("A idade do Ninja: "+idade);
        System.out.println("A Missão do Ninja"+missao);
        System.out.println("Nivel da dificuldade da Missão"+nivelDificuldade);
        System.out.println("Status da missão: "+statusDaMissao);
        System.out.println(habilidadeEspecial);
    }
}
