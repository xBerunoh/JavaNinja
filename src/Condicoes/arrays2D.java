package Condicoes;

public class arrays2D {
    public static void main(String[] args) {

        String[][] ninjasEaldeias = new String[3][3];
        ninjasEaldeias[0][0] = "Aldeia da Folha ";
        ninjasEaldeias[1][0] = "Aldeia da Nevoa ";
        ninjasEaldeias[2][0] = "Aldeia da Areia ";
        ninjasEaldeias[0][1] = "Naruto";
        ninjasEaldeias[0][2] = "Sasuke";
        ninjasEaldeias[1][1] = "Zabuza";
        ninjasEaldeias[1][2] = "Kisame";
        ninjasEaldeias[2][1] = "Gaara";
        ninjasEaldeias[2][2] = "Kankuro";

         for (int i = 0; i < ninjasEaldeias.length; i++) {
            System.out.println(ninjasEaldeias[i][0]);
            for (int j = 1; j < ninjasEaldeias[i].length; j++) {
                System.out.println(ninjasEaldeias[i][j]);
            }

        }

    }
}
