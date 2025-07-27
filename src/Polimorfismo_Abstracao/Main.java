package Polimorfismo_Abstracao;

import org.w3c.dom.ls.LSOutput;

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


        // Objeto uchiha 2

        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da FOlha", 20);
        itachi.habilidadeEspecial();

        // Objeto Uchiha 3

        Uchiha madara = new Uchiha("Marada","Aldeida da Folha",45,400,nivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeCombate();

    }


}
