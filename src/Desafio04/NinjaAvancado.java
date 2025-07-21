package Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public void mostrarInformacoes(){

    }

    public void executarHabilidade(){

    }
    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
    public NinjaAvancado() {
    }


}
