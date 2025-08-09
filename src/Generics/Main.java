package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     EquipamentosNinja kunai =  new EquipamentosNinja("Kunai");
        EquipamentosNinja shuriken =  new EquipamentosNinja("shuriken");
        EquipamentosNinja pergaminho =  new EquipamentosNinja("pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);
        System.out.println(bolsaGenerica);
    }
}
