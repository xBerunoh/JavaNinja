package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: Maneira de reduzir o código, funciona como o IF e Else !
        * variavel = (condicao) ? valorSeVerdadeiro : ValorSeFalso;
        * */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse Ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
