package aulaStream;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto","Konoha",17));
        ninjas.add(new Ninja("Ana","Konoha",17));
        ninjas.add(new Ninja("Sasuke","Konoha",18));
        ninjas.add(new Ninja("Sakura","Konoha",16));
        ninjas.add(new Ninja("Gaara","Areia",18));
        ninjas.add(new Ninja("Orochimaru","Son",40));

/* Quando aprendemos utilizar Streams vamos nos sentir macaco usando for
        for (int i = 0; i < ninjas.size(); i++) {
            System.out.println(ninjas);
        }
        */
        // .stream
        //FILTRAGEM DOS NINJAS POR ALDEIA
        ninjas.stream()
                .filter( ninja -> ninja.getAldeia().equals("Konoha"))
                .forEach(System.out::println); //soutc

        //ORDENAÇÃO DOS NINJAS POR IDADE
        System.out.println("-------------ORDENAÇÃO POR IDADE ----------");
        ninjas.stream()
                .sorted((n1,n2) -> Integer.compare(n1.getIdade(),n2.getIdade()))
                .forEach(System.out::println);
        // ORDENAÇÃO DOS NINJAS POR NOME
        System.out.println("-------------ORDENAÇÃO POR NOME ----------");
        ninjas.stream()
                .sorted((n1,n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        // MAP -> Mostrar e mapear um atributo !
        System.out.println("------------MAP------------");
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        // MAX - FILTRAR POR NINJA MAIS VELHO
        System.out.println("--------NINJA MAIS VELHO-----");
       Ninja ninjaMaisVelho = ninjas.stream()
    .max((n1,n2) -> Integer.compare(n1.getIdade(),n2.getIdade())).orElse(null);
        System.out.println("Ninja filtrado pelo mais velho:"+ninjaMaisVelho);
    }
}