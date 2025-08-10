package Generics;

import java.util.ArrayList;
import java.util.List;

// Deixar classe generica utiliza o simbolo <>
public class BolsaGenerica<T> {

    // Inicializar nosso array !
    private List<T> equipamentos; // lista generia !


    // Construtores
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

    public void mostrarEquipamento(){
        for (T equipamento : equipamentos){
            System.out.println(equipamento);
        }
    }
}
