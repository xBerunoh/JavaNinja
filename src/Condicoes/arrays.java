package Condicoes;



public class arrays {
    public static void main(String[] args) {

        String[] ninja = new String[6];
        int[] idade = new int[4];
        boolean[] narutoHokage = new boolean[1];
        ninja[0] = "Naruto Uzumaki"; // INDEX [0]
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";

        idade[0] = 17;
        idade[1] = 16;
        idade[2] = 15;

        /*System.out.println(ninja[0]);
        System.out.println(ninja[1]);
        System.out.println(ninja[2]);
        System.out.println(ninja[5]); // inicializando sem valor
        System.out.println(idade[3]);// inicializando sem valor
        System.out.println(narutoHokage[0]); // inicializando sem valor*/

        // Redeclarar o ARRAY
        //garbage collection vai vim e matar a antiga ARRAY.
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

         System.out.println(ninja[7]);

        // For para fazer um LOOP no array !
        for (int  i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

    }
}
