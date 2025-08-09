package Generics;

import java.util.ArrayList;
import java.util.List;

// Deixar classe generica utiliza o simbolo <>
public class BolsaGenerica<T> {
    private List<T> equipamentos; // lista generia !

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // Colocar equipamentos genericos
    public void adicionarEquipamentos(T equipamentoGenerico){
    equipamentos.add(equipamentoGenerico);

    }


    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }


    @Override
    public String toString(){
        return  "Bolsas de equipamentos: "+ equipamentos.toString();
    }
}
