package classesAbstratas;

public class Hokages {
    // ATRIBUTOS
    String nome;
    int idade;
    boolean vivoOunao;

// Você consegue criar automaticamente os construtores com o GENERETE : (CTRL + N) SHORT CUTS
    public Hokages(String nome, int idade, boolean vivoOunao) {
        // `all - args`
        this.nome = nome;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
        // This faz referencia ao seu atributo, o seu atributo recebe como valor o seu PARAMETRO ! criando um construtor
    }
        // Constutor Vazio , sem argumentos !
    public Hokages() {
        // `No - args`
    }
}
