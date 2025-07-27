package Polimorfismo_Abstracao;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // Objeto Ninja não pode ser criado por ser uma classe abstrata !

        // Nosso objeto uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Aldeida da Folha",18,23,nivelNinja.GENIN);
        naruto.habilidadeEspecial();


        //  objeto Uchiha 1.

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",19,25,nivelNinja.GENIN);
        sasuke.habilidadeEspecial();


        // Objeto uchiha 2

        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da FOlha", 20,230,nivelNinja.JOUNIN);
        itachi.habilidadeEspecial();

        // Objeto Uchiha 3

        Uchiha madara = new Uchiha("Marada","Aldeida da Folha",45,400,nivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeCombate();
        madara.inteligenciaDeCombate(90);

    }


}
