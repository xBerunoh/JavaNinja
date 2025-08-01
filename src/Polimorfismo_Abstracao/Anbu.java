package Polimorfismo_Abstracao;
// `Final class` - essa classe não pode ser estendida !
// Diferença de uma classe final , para uma abstrata :
// Class Abstrata , você não pode criar um objeto !
// Class Final , você não pode estender ela, porém pode criar um objeto !
final public class Anbu {
    String nome;
    public void anbu(){
        System.out.println("Eu sou um Anbu !");
    }
}
