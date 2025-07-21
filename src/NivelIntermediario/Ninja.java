package NivelIntermediario;

public class Ninja
{
// Ninja precisa de um NOME , IDADE E ALDEIA;
    String nome;
    String missao;
    String statusDaMissao;
    String nivelDificuldade;
    int idade;

    // Método , para mostrar todos os meus atributos do ninja !
    public void mostrarInformacao(){
        System.out.println("Nome do Ninja: "+nome);
        System.out.println("A Idade do Ninja: "+idade);
        System.out.println("Nome da Missão: "+missao);
        System.out.println("Status da Missão: "+statusDaMissao);
        System.out.println("Nivel da Dificuldade: "+nivelDificuldade);

    }

}
