package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     BolsaGenerica<Object> bolsaNinja = new BolsaGenerica<>();
     bolsaNinja.adicionarEquipamentos(new EquipamentosNinja("Kunai"));
        bolsaNinja.adicionarEquipamentos(new EquipamentosNinja("Shurikem"));
        bolsaNinja.adicionarEquipamentos(new EquipamentosNinja("Pergaminho"));
        bolsaNinja.adicionarEquipamentos(new EquipamentosNinja("Remedio"));

     bolsaNinja.mostrarEquipamento();
    }
}
