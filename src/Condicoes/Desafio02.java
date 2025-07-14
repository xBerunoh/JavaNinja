package Condicoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Criar um Array
        int NUMERO_MAX = 5;
        String[] ninja = new String[NUMERO_MAX];
        int menu = 0;
        // Contador
        int contNinjas = 0;
        while(menu != 3){

        System.out.println("1 - Cadastrar Ninja");
        System.out.println("2 - Listar Ninjas");
        System.out.println("3 - Sair");
        System.out.println("Escolha alguma opção");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu){
            case 1:
                if (contNinjas < 5){
                System.out.println("Cadastrar Ninja: ");  
                ninja[contNinjas] = sc.nextLine();
                contNinjas++;
                }else{
                    System.out.println("Não possui mais espaço para cadastrar ninjas !");
                }
                break;
            case 2:
                if(contNinjas == 0){
                    System.out.println("Não possui nenhum ninja cadastrado !");
                }else{
                for (int i = 0; i < contNinjas; i++) {
                    System.out.println(ninja[i]);
                }
                }
            default:
                System.out.println("Opção Invalida !");
                break;
        }
        }

    }
}
