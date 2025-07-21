package NivelIntermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Objeto 2
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 18;
        Naruto.modoSabio();
        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 18;
        Sakura.ativarCura();
        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 17;
        Hinata.ativarByakugan();

        // Objeto Boruto

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 12;
        boruto.ativarOKarma();
        boruto.ativarJougan();
    }
}
