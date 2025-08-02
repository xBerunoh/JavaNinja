package Resumo;

import encapsulamento.Ninja;

public class Uchiha extends Ninja implements ShariganInterface{


     /*
     * Construtores:
     * Construtores com ´ all args´
     * */

    public Uchiha(String nome, String aldeia, int idade, int numerosDeMissoesConcluidas, double altura, NivelNinja nivel) {
        super(nome, aldeia, idade, numerosDeMissoesConcluidas, altura);
    }



    /*
     * Construtores:
     * Construtores com ´ no args´
     * */
    public Uchiha() {
    }


    /*
    * Metodo:
    * Implementa da Interface Sharigan
    * */
    public void shariganAtivado() {
        System.out.println("Meu nome "+getNome()+" eu sou um uchiha , ativei o meu sharigan !");
    }
}
