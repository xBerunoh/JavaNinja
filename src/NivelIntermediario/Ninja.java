package NivelIntermediario;

public class Ninja
{
// Ninja precisa de um NOME , IDADE E ALDEIA;
    String nome;
    String aldeia;
    int idade;
    int idadeMinimaHokage = 50;
    // Métodos

    // Método que não retorna nada VOID
    public void ativarSharigan(){
        System.out.println("Sharigana tivado !");
    }

    //Método inteiro que precisa retornar um número inteiro

    public int idadeParaSerHokage(int idadeHokage){
        return idadeMinimaHokage - idade;
    }

    // Método String precisa retorna um bloco de caracter

    public String helloNinja(){
        return "Oi eu sou um ninja";
    }

}
