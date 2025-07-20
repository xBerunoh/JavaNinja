package NivelFacil.Condicoes;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*Crie um programa que cadastre até 5 pessoas (nome e idade).
        O usuário pode parar o cadastro a qualquer momento digitando "sair". Após o cadastro, exiba:
        Quantas pessoas são maiores de idade.
        O nome da pessoa mais velha.
        A média das idades.*/
        Scanner sc = new Scanner(System.in);
        // LIMITANDO QUANTAS PESSOAS SERÃO CADASTRADAS
        int NUMERO_MAX = 5;

        // CRIAÇÃO DO ARRAY
        String[] cadastroDePessoas = new String[NUMERO_MAX];
        int[] idadeDePessoas = new int[NUMERO_MAX];

        //CONTADORES
        int quantidadeDePessoas = 0;
        int opcao = 0;
        int soma = 0;
        // LAÇO DE REPETIÇÃO
        while (opcao != 2) {
            System.out.println("1 - Cadastro da " + quantidadeDePessoas + " pessoa");
            System.out.println("2 - Sair");
            opcao = sc.nextInt(); // RECEBER O INPUT DO USUÁRIO
            sc.nextLine();
            // CADASTRO DE PESSOAS
            if (quantidadeDePessoas == NUMERO_MAX) {
                System.out.println("CADASTRO LIMITE ATINGINDO");
            } else if (quantidadeDePessoas < 6) {
                System.out.println("Cadastre o nome da pessoa");
                cadastroDePessoas[quantidadeDePessoas] = sc.nextLine(); // RECEBE O NOME
                System.out.println("Cadastre a idade da pessoa");
                idadeDePessoas[quantidadeDePessoas] = sc.nextInt(); // RECEBE IDADE
                quantidadeDePessoas++;
            }
        }
        // OPÇÃO PARA SAIR DO PROGRAMA QUANDO DIGITADO 2
        if (opcao == 2) {
            System.out.println("Programa de cadastro finalizado !!");
        }
        // MOSTRAR AS PESSOAS CADASTRADAS
        for (int i = 0; i < quantidadeDePessoas; i++) {
                    if(cadastroDePessoas[i] != null){
            System.out.println(cadastroDePessoas[i] + " tem idade: " + idadeDePessoas[i]);
        }
        }

        // CONTAR QUANTAS PESSOAS SÃO MAIORES DE 18
        int contadorDeIdades = 0;
        for (int i = 0; i < quantidadeDePessoas ; i++) {
            if (idadeDePessoas[i] >= 18){
                contadorDeIdades++;
            }
        }
        System.out.println("Quantidade maiores de idade: "+contadorDeIdades);
        // DESCOBRIR QUEM É MAIOR DE IDADE
        int maior = idadeDePessoas[0];
        int indiceMaior = 0;
        for (int i = 1; i < quantidadeDePessoas; i++) {
            if(idadeDePessoas[i] > maior){
                maior = idadeDePessoas[i];
                indiceMaior = i;
            }
        }
                    System.out.println("Maior idade é "+maior);
        // Média das idades

        int somaIdades = 0;
        for (int i = 0; i < quantidadeDePessoas; i++) {
            somaIdades += idadeDePessoas[i];
        }
        double media = (double) somaIdades / quantidadeDePessoas;
        System.out.printf("Média das idades: %.2f\n", media);
        System.out.println("soma dos idades: "+somaIdades);

        }

    }


