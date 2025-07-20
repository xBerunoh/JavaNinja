package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
        * SwitchCases: Que servem para gerar casos especificos !
        * Objetivo: Opção do usuário escolher, qual ninja ele gostaria de ver !
        *
        * */

                //ABRIR A CAIXA - Pedir para o usuário
        Scanner sc = new Scanner(System.in);
        // Mostrar opções ao usuário
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuário escolher uma das opções
       int escolhaDoUsuario = sc.nextInt();
        System.out.println("Você digitou o número: "+escolhaDoUsuario);

        // Reacão ao escolher um personagem !

        switch (escolhaDoUsuario)    {
            case 1:
                System.out.println("Você escolheu o Naruto");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura");
                break;
            default:
                System.out.println("Você escolheu a opção invalida ! ");
                break;
        }






        sc.close(); // FECHAR A CAIXA
    }

}
