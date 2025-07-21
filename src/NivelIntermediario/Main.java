package NivelIntermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ninja ninja = new Ninja();
        System.out.println("Menu");

        System.out.println("1 - Adicionar Novos Ninjas !");
        System.out.println("2 - Atualizar Habilidades especiais dos Ninjas !");
        System.out.println("3 - Exibir informações do Ninja !");
        System.out.println("4 - Sair");
        // receber a opção do usuário do menu
        int menu = sc.nextInt();
        sc.nextLine();
        while (menu != 4){
        switch (menu){
            case 1:
                // Criando um obejto (Ninja Normal !)

                System.out.print("Digite o Nome do Ninja: ");ninja.nome = sc.nextLine();
                System.out.print("Digite a Idade do Ninja: "); ninja.idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o Status da Missao: ");ninja.statusDaMissao = sc.nextLine();
                System.out.print("Digite o nivel da Missaõ: ");ninja.nivelDificuldade = sc.nextLine();
                break;
                case 2:
                    ninja.mostrarInformacao();
                    break;
        }
        }


        // ninja.habilidadeEspecial = sc.nextLine();

        // Criando um obejto (Ninja UCHIHA !)
        Uchiha ninjaUchiha = new Uchiha();
        ninjaUchiha.nome = sc.nextLine();
        ninjaUchiha.idade = sc.nextInt();
        ninjaUchiha.statusDaMissao = sc.nextLine();
        ninjaUchiha.nivelDificuldade = sc.nextLine();
        ninjaUchiha.habilidadeEspecial = sc.nextLine();



//        Sasuke.nivelDificuldade = "A";
//        Sasuke.statusDaMissao = "Em Andamento";
//        // Objeto 2
//        Uzumaki Naruto = new Uzumaki();
//        Naruto.nome = "Naruto";
//        Naruto.idade = 18;
//        Naruto.modoSabio();
//        // Objeto 3
//        Haruno Sakura = new Haruno();
//        Sakura.nome = "Sakura";
//        Sakura.idade = 18;
//        Sakura.ativarCura();
//        // Objeto 4
//        Hyuga Hinata = new Hyuga();
//        Hinata.nome = "Hinata";
//        Hinata.idade = 17;
//        Hinata.ativarByakugan();
//        // Chamando metodo para mostrar informaçõe dos Ninjas !
//        Naruto.mostrarInformacao();
//        System.out.println("------------------");
//        Sasuke.mostrarInformacao(); // Objeto 1
//         Uchiha Sasuke = new Uchiha();
//         Sasuke.nome = "Sasuke";
//         Sasuke.idade = 19;
//         Sasuke.habilidadeEspecial = "Sharigan";
//         Sasuke.missao = "Resgatar amigos perdidos na vila da chuva!";

    }
}
