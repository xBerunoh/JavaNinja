package encapsulamento;

public class Missoes {
    private String nome;
    private RankDeMissoes rank; // chamando o Enum !


    // METODO PARA MOSTRAR INFORMACOES

    public void exibirDetalhes(){
        System.out.println("Missão: "+nome+" - Dificuldade: "+getRank().getDescricao() +" - Pontuação:"+rank.getPontuacao());
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
