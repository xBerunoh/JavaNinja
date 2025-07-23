package Construtores;

public class Main {
    public static void main(String[] args) {
        Hokages hashirama = new Hokages("hashirama",40,false);
        Hokages tobirama = new Hokages("Tobirama",49,false);
        Hokages minato = new Hokages("Minato",40,false);

        System.out.println(hashirama.nome);
        System.out.println(minato.idade);
    }
}
