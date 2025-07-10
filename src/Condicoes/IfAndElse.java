package Condicoes;

public class IfAndElse {
    public static void main(String[] args) {
      /*
      *IF and Else - CONDIÇÕES
      * Else IF
      * Objetivo: Passar o ninja de nivel de acordo com o número de missões !
      *
      * if (condicao) {resultado}
      * else if(condicao) {resultado}
      * else {se não cumprir o requisito do IF}
      * *

        // EXEMPLO DRAGON BALL - NIVEL DE PODER DO GOKU CADA SAGA
       */
            String nome = "GOKU";
            int levelOfPower = 12000;

            if(levelOfPower <= 8000){
                System.out.println("Saga Saiyajin");
            }else if(levelOfPower > 8000 && levelOfPower <= 15000){
                System.out.println("Saga Freeza");
            }else if(levelOfPower > 15000 && levelOfPower <=25000){
                System.out.println("Saga CELL");
            }else {
                System.out.println("Saga Depois do CELL");
            }




    }
}
