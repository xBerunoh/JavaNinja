package Polimorfismo_Abstracao;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado por ser uma classe abstrata !

        // Nosso objeto uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        // Nosso objeto Uchiha.
        Uchiha sasuke = new Uchiha();
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();
    naruto.estrategiaDeCombate();
    }
}
