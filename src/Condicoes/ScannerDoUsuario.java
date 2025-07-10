package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = é um jeito de trazer o usuário para dentro da aplicação.
        * Objetivo: O usuário vai criar um ninja e vamos validar os dados.
        * */

        // Abrir o Scanner
        Scanner boxText = new Scanner(System.in);
        Scanner boxInt = new Scanner(System.in);
        // Criar um novo objeto new / Scanner() < vamos colocar coisas dentro.
        // System.in -< Autoriza o usuário colocar qualquer coisa dentro
        System.out.println("Digite o nome do Ninja: ");
        String nome = boxText.nextLine(); // receber uma string
        System.out.println("Digite a idade do Ninja: ");
        int idade = boxInt.nextInt(); // recebe um número
        System.out.println("O nome do ninja é "+nome);
        System.out.println("A idade do Ninja é: "+idade);
        if(idade <= 7){
            System.out.println("Podera fazer o teste para se torna um ninja");
        }else{
            System.out.println("Já deveria ser um ninja");
        }

        boxText.close(); // Fechar o Scanner
    }
}
