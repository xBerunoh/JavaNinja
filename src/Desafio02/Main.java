package Desafio02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int NUMERO_MAX = 10;
        Ninja[] ninjas = new Ninja[NUMERO_MAX];
        Uchiha[] ninjaUchiha = new Uchiha[NUMERO_MAX];
        int escolhaNinja= 0;
        int quantidadeNinjasComuns = 0;
        int quantidadeNinjasUchihas = 0;
        int escolhaOpcao = 0;
        while(menu != 4){
        System.out.println("Menu");
        System.out.println("1 - Exibir informações dos Ninjas");
        System.out.println("2 - Adicionar um ninja ");
        System.out.println("3 - Atualizar as habilidades especias");
        System.out.println("4 - Sair do sistema");
         menu = sc.nextInt();
        sc.nextLine(); // Para não dar o Bug do BUFFER

        switch (menu){
            case 2:
                System.out.println("Cadastro de Ninjas !");
                System.out.println("Escolha se você quer um ninja normal ou um uchiha");
                System.out.println("Limite Ninja: "+NUMERO_MAX);
                System.out.println("(1) - Ninja Normal");
                System.out.println("(2) - Ninja Uchiha");
                escolhaNinja = sc.nextInt();
                sc.nextLine(); // Para não dar o Bug do BUFFER
               if(escolhaNinja == 1){
                   NUMERO_MAX--;
                   ninjas[quantidadeNinjasComuns] = new Ninja();
                   System.out.println("Digite o nome do Ninja: ");
                   ninjas[quantidadeNinjasComuns].nome = sc.nextLine();
                   System.out.println("Digite a idade do Ninja: ");
                   ninjas[quantidadeNinjasComuns].idade = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Digite a Missão do Ninja: ");
                   ninjas[quantidadeNinjasComuns].missao = sc.nextLine();
                   System.out.println("Digite o nivel da dificuldade Missão do Ninja: ");
                   ninjas[quantidadeNinjasComuns].nivelDificuldade = sc.nextLine();
                   System.out.println("Digite o Status da Missão do Ninja: ");
                   ninjas[quantidadeNinjasComuns].statusDaMissao = sc.nextLine();
                   quantidadeNinjasComuns++;
                   }else if(escolhaNinja == 2){
                   NUMERO_MAX--;
                   ninjaUchiha[quantidadeNinjasUchihas] = new Uchiha();
                   System.out.println("Digite o nome do Ninja: ");
                   ninjaUchiha[quantidadeNinjasUchihas].nome = sc.nextLine();
                   System.out.println("Digite a idade do Ninja: ");
                   ninjaUchiha[quantidadeNinjasUchihas].idade = sc.nextInt();
                   sc.nextLine();
                   System.out.println("Digite a Missão do Ninja: ");
                   ninjaUchiha[quantidadeNinjasUchihas].missao = sc.nextLine();
                   System.out.println("Digite o nivel da dificuldade Missão do Ninja: ");
                   ninjaUchiha[quantidadeNinjasUchihas].nivelDificuldade = sc.nextLine();
                   System.out.println("Digite o Status da Missão do Ninja: ");
                   ninjaUchiha[quantidadeNinjasUchihas].statusDaMissao = sc.nextLine();
                   ninjaUchiha[quantidadeNinjasUchihas].habilidadeEspecial = "Sharigan";
                   quantidadeNinjasUchihas++;
               } else {
                   System.out.println("Sem Opção !");
               }
        break;
            case 1:
                if(quantidadeNinjasComuns > 0 || quantidadeNinjasUchihas > 0){
                for (int i = 0; i < quantidadeNinjasComuns; i++) {
                    ninjas[i].mostrarInformacoes();
                    System.out.println("------------------------------");
                    } for (int j = 0; j < quantidadeNinjasUchihas; j++) {
                ninjaUchiha[j].mostrarInformacoes();
                        System.out.println("------------------------------");
                }}else{
                    System.out.println("Sem cadastro de Ninjas !");
                }
                break;
            case 3:
                System.out.println("Mudar habilidade especial dos uchihas !");
                for (int i = 0; i < quantidadeNinjasUchihas; i++) {
                    System.out.println(i+" - "+ninjaUchiha[i].nome);
                    }
                System.out.println("Escolha o número referente ao ninja para trocar a habilidade especial");
                escolhaOpcao = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite qual é a nova habilidade especial do ninja: "+ninjaUchiha[escolhaOpcao].nome);
                ninjaUchiha[escolhaOpcao].habilidadeEspecial = sc.nextLine();
                break;
            case 4:
                System.out.println("Você saiu do sistema");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        }
    }
}
