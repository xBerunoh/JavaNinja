package TiposDeDados;

import java.sql.SQLOutput;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados Não Primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja, e atribuir metodos a ele,
         * Metodos: São caracteriscas das nossas váriaveis,
         * */

        String nome = "Uchiha Sasuke";
        String nomeUpperCase = nome.toUpperCase(); // vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK "+nomeUpperCase);
        System.out.println("Esse texto está em normal "+nome);

        String aldeia = "ALDEIA DA FOLHA,ALDEIA DA AREIA,ALDEIA DO SOM";

        String aldeiaLowerCase = aldeia.toLowerCase(); // vai colocar tudo em MINUSCULO
        int aldeiaLenght = aldeia.length(); // Ele verifica quantos caracteres tem a váriavel
        String[] aldeiaSplit = aldeia.split(","); // Ele divide uma String em partes usando delimitador
        /*
        * Regex: expressão regular (padrão para dividir)
        * */
        System.out.println("Esse texto vai está todo em MINUSCULO "+aldeiaLowerCase);
        System.out.println("Tamanho da String: "+aldeiaLenght);
        for(String s : aldeiaSplit){
            System.out.println(s);
        }


        }

        /*
        :D
        * */

    }

