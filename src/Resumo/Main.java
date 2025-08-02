package Resumo;

public class Main {

    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",19,30,1.71,NivelNinja.CHUUNIN);
        Uchiha itachi = new Uchiha("Itachi","Aldeia da Folha",30,300,1.81,NivelNinja.JOUNIN);

        sasuke.shariganAtivado();
        itachi.shariganAtivado();

    Uzumaki naruto = new Uzumaki("Naruto","Aldeia da Folha",18,28,1.66,NivelNinja.GENNIN,Bijus.KURAMA);
    naruto.HabilidadeEspecial();
        System.out.println(naruto.bijus);



    }

}
