package Desafio06;

import java.util.LinkedList;

public class Ninjas {
    String nome;
    int idade;
    String vila;

    public Ninjas(String vila, int idade, String nome) {
        this.vila = vila;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public Ninjas() {
    }

    public void adicionarNinja(){

    }

    @Override
    public String toString() {
        return "Ninjas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", vila='" + vila + '\'' +
                '}';
    }
}
