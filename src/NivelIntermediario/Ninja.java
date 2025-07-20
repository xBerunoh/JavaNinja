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

    //Método que precisa retornar algo !

    public int idadeParaSerHokage(int idadeHokage){
        return idadeMinimaHokage - idade;
    }

}
