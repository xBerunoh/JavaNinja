package encapsulamento;

public enum RankDeMissoes {

   // Rank de Missões

    D("Baixo",1),
    C("Moderado",2),
    B("Dificil",3),
    A("Expert",4),
    S("Impossivel",5),
    ;

    private String descricao;
    private int pontuacao;

    RankDeMissoes(String descricao, int pontuacao) {
        this.descricao = descricao;
        this.pontuacao = pontuacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
