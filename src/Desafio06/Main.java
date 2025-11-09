package Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        * LinkedList = VALOR + PONTEIRO
        * */
        // INICIAR UMA LINKEDLIST COM 7 NINJAS.
        LinkedList<Ninjas> listDeNinjas = new LinkedList<Ninjas>();

        // adicionar os ninjas na minha LinkedList
        listDeNinjas.add(new Ninjas("Konoha",20,"Naruto"));
        listDeNinjas.add(new Ninjas("Konoha",21,"Sasuke"));
        listDeNinjas.add(new Ninjas("Konoha",31,"Kakashi"));
        listDeNinjas.add(new Ninjas("Konoha",19,"Sakura"));
        listDeNinjas.add(new Ninjas("Konoha",24,"Neji"));
        listDeNinjas.add(new Ninjas("Areia",18,"Gaara"));
        listDeNinjas.add(new Ninjas("Son",40,"Orochimaru"));
        // LISTAR O NINJA
        System.out.println("Listas de Ninjas");
        // Complexidade: o(N)
        for (Ninjas ninjas : listDeNinjas){
            System.out.println(ninjas);
        }
        // ADICIONAR O NINJA NO INCIO DA LISTA.
        listDeNinjas.addFirst(new Ninjas("Konoha",12,"Boruto"));
        // REMOVER O NINJA NO INICIO DA LIST
        Ninjas removido = listDeNinjas.removeFirst();
        System.out.println("--------------NINJA REMOVIDO------------");
        System.out.println("Ninja removido:"+removido);

        // Listar os ninjas
        System.out.println("--------------------LISTA ATUALIZADA ------------------");
        for (Ninjas ninjasAtualizados : listDeNinjas){
            System.out.println(ninjasAtualizados);
        }

        // PROCURAR UM NINJA POR INDICE
        System.out.println("-------------NINJAS PESQUISADOS-------------");
        Ninjas terceiroNinja = listDeNinjas.get(3);
        System.out.println(terceiroNinja);


    }
}
