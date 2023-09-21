package Aula14;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ListArrayOfInteger lista = new ListArrayOfInteger();
        lista.add(10);
        lista.add(20);
        lista.add(21);
        lista.add(22);
        lista.add(28);
        System.out.println("Lista");
        System.out.println(lista);
        System.out.println("Primeiro elemento: " + lista.get(0));

        //System.out.println(lista.size());

        int tam = lista.size();
        System.out.println("Ultimo elemento da lista: " + lista.get(tam - 1));

        System.out.println(lista.isEmpty());
        System.out.println("");
        System.out.println(lista.toString());

        lista.remove(20);
        System.out.println("Removendo elemento: " + 20);
        System.out.println("                         ");
        System.out.println("Lista atualizada         ");
        System.out.println(lista);

        System.out.println(lista);
        lista.set(1,3);
        System.out.println("Lista atualizada da troca de posição");
        System.out.println(lista);
    }


    
}
