package Condicoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int NUMERO_MAX = 5;
        int qtaNinjas = 0;
        String[] cadastrarNinja = new String[NUMERO_MAX];
        while(menu != 3){
        System.out.println("1 - Cadastrar Ninja");
        System.out.println("2 - Listar Ninjas");
        System.out.println("3 - Sair");
        System.out.println("Escolha alguma opção");
        menu   = sc.nextInt(); // Usuário entrar com a opção do menu
        sc.nextLine();
        switch (menu){
            case 1:
                if(qtaNinjas < NUMERO_MAX ){
                System.out.print("Cadastrar o ninja: ");
                cadastrarNinja[qtaNinjas] = sc.nextLine();
                qtaNinjas++;
                } else {
                    System.out.println("Valor maximo de ninjas, impossivel de cadastrar ! ");
                }
                break;
            case 2:
                if(qtaNinjas == 0){
                    System.out.println("Nenhum ninja foi encontrado !");
                }else{
                for (int i = 0; i < qtaNinjas; i++) {
                    System.out.println(i+" - "+cadastrarNinja[i]);
                }
                }

            case 3:
                System.out.println("Estamos saindo do programa !");
                break;
            default:
                System.out.println("Opção invalida!");
                break;


        }
    }
}}
