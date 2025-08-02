package encapsulamento;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke","Aldeia da Folha",19,30,1.71);
        System.out.println(sasuke.getNome()); // Utilizando Get , para mostrar o nome do uchiha sasuke
        sasuke.setNome("Madara Uchiha"); // utilizando metodo set para alterar o nome do objeto SASUKE.
        System.out.println(sasuke.getNome());

        Uzumaki naruto = new Uzumaki();

        Missoes quest = new Missoes("resgatar o gato",RankDeMissoes.D);
        quest.exibirDetalhes();

    }
}
