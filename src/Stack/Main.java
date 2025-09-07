package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //ARRAY
        String[] ninjaArray = new String[3];

        // List
        List<String> ninjaList = new ArrayList<>();

        // Stack
        Stack<String> ninjaStack = new Stack<>();
        // psuh adiciona elementos na minha pilha !
        
        System.out.println(ninjaStack);
        ninjaStack.pop();
        // POP remove o ultimo elemento colocado na pilha
        System.out.println("Após o método POP()");
        System.out.println(ninjaStack);
        System.out.println("Qual é o elemento que está no topo da PILHA:"+ninjaStack.peek());
        // Size mostra o tamanho da pilha
        System.out.println("Tamanho da Stack:"+ninjaStack.size());

    }
}
