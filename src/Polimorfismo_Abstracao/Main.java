package Polimorfismo_Abstracao;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado por ser uma classe abstrata !

        // Nosso objeto uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();
        naruto.estrategiaDeCombate();
        // Nosso objeto Uchiha.
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.estrategiaNinja();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeCombate();
    }
}
