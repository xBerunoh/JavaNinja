package encapsulamento;

public enum RankDeMissoes {

   // MISSÕES
    D("Baixo",2),
    C("Moderado",3),
    A("Dificil",4),
    S("Expert",5),;


    private String descricao;
    private int pontuacao;

    RankDeMissoes(String descricao, int pontuacao) {
        this.descricao = descricao;
        this.pontuacao = pontuacao;
    }
}
