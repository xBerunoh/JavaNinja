package NivelIntermediario;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("O Ninja "+nome+" sua habiliade especial: "+habilidadeEspecial);
    }

    public void mostrarInformacao(){
        System.out.println("Nome do Ninja: "+nome);
        System.out.println("A idade do Ninja: "+idade);
        System.out.println("Nome da Missão: "+missao);
        System.out.println("Status da Missão: "+statusDaMissao);
        System.out.println("Nivel da Faculdade: "+nivelDificuldade);
        mostrarHabilidadeEspecial();
    }
}
