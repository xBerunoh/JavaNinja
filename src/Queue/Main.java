package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue -> Filas

        // Queue faz parte da familia LinkedList (Estrutura cadeada)
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("NARUTO");
        ninjasQueue.add("SAKURA");
        ninjasQueue.add("SASUKE");
        ninjasQueue.add("MADARA");
        ninjasQueue.add("ITACHI");
        // MOSTRAR FILA
        System.out.println("Ninjas na fila: "+ ninjasQueue);

        // Tirar um ninja da FILA
        ninjasQueue.poll();
        System.out.println("Ninjas da fila depois do POOL: "+ninjasQueue);

        // Como ver quem é o primeiro
        String primeiroDaFila = ninjasQueue.peek();
        System.out.println("Ver o primeiro da FILA: "+primeiroDaFila);

        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama");

        System.out.println("Novos:"+ninjasQueue);

        //DELETAR O TAIL ( IMPOSSIVEL )boi

    }
}
