package Desafio04;

import java.sql.SQLOutput;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    // CONCSTRUCTION
    public NinjaAvancado(String nome, int idade, String habilidade, tipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }
    @Override // ANOTATION
    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja "+nome);
        System.out.println("Idade do Ninja "+idade);
        System.out.println("Habilidade do Ninja "+habilidade);
        System.out.println("Especialidade: "+especialidade);
        System.out.println("Tipo de Habilidade: "+tipoHabilidade);

    }
    @Override
    public void executarHabilidade(){
        System.out.println("Eu sou um ninja Top das Galaxias , vou soltar minha habilidade: "+habilidade);

    }
    public NinjaAvancado() {
    }

}
