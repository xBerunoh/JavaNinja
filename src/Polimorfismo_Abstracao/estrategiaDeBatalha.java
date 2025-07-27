package Polimorfismo_Abstracao;

public interface estrategiaDeBatalha {
    // Interfaces servem como CONTRATOS !!!!
    // Metodo abstrato - Obrigatorio em todas as classes !
    void estrategiaNinja();
    void estrategiaDeCombate();

    void inteligenciaDeCombate();
    // Sobrecarga de métodos - metodo com o mesmo nome, porem com parametros !


    void inteligenciaDeCombate(int qi);
}

