package Condicoes;

import java.util.Scanner;

public class ExercicioIfAndElse {
    public static void main(String[] args) {
        /*
        * Faça um programa que receba duas notas, calcule e
        * mostre a média aritmética e mensagem que está na tabela a seguir:
* */

        //Abrir a nossa Caixa
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Digite o valor da segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.println("O valor da primeira nota é "+nota1+" \n e o valor da segunda nota é "+nota2);

        double mediaAritmetica = (nota1 + nota2)/2;

        System.out.println("A média da notá é "+mediaAritmetica);

/*        String media = (mediaAritmetica  >= 7) ? "Você Passou" : "Não passou";
        System.out.println(media);*/
        if(mediaAritmetica <= 4){
            System.out.println("Reprovado !");
        }else if(mediaAritmetica >= 4.1 && mediaAritmetica <= 7.0){
            System.out.println("Exame !");
        }else{
            System.out.println("Aprovado");
        }


    }
}
