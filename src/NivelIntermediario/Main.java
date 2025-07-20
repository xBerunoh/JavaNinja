package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

    // Criar um ninja Sasuke Uchiha , que sasuke é um OBJETO !

         Ninja Sasuke = new Ninja();

         Sasuke.nome = "Sasuke";
         Sasuke.idade = 30;
         Sasuke.aldeia = "Renegado";


        System.out.println("Nome: "+Sasuke.nome+
                " Idade:"+Sasuke.idade+
                " Aldeia:"+Sasuke.aldeia
        );

        // Criar outro Objeto, que vou chamar de NARUTO !

        // Objeto criado, atribuir valores:
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Konoha";

        System.out.println("Nome: "+naruto.nome+
                " Idade:"+naruto.idade+
                " Aldeia:"+naruto.aldeia
        );

        Sasuke.ativarSharigan();

       int idadeSasukeHokag = Sasuke.idadeParaSerHokage(Sasuke.idade);
        System.out.println(idadeSasukeHokag);

        // Fazendo a chamada do meu método HelloNinja
        String ninjaHello= Sasuke.helloNinja();
        System.out.println(ninjaHello);
    }
}
