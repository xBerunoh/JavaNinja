package Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array , são estatias , tendo que definir o tamanho.
        String[] ninjasArray = new String[3];
        // Listas são dinamicas , aumentando e diminuindo o seu tamanho automaticamente .
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki"); // Adicionar na List
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Minato Namikaze");
        System.out.println(ninjasList); // super poder da List<> utilizando toString()

        // Remover da List
        ninjasList.remove("Minato Namikaze");
        System.out.println(ninjasList);

        // Trocar Elementos !
        ninjasList.set(1,"Sakura Haruno");
        System.out.println(ninjasList);

        // Ver o tamanho da List
        System.out.println(ninjasList.size()+" Elmentos");

    }
}
