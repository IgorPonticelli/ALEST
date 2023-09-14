package Aula14;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ListArrayOfInteger lista = new ListArrayOfInteger();
        lista.add(10);
        lista.add(20);

        System.out.println(lista);
        System.out.println("Primeiro elemento: " + lista.get(0));

        //System.out.println(lista.size());
        int tam = lista.size();
        System.out.println("Ultimo elemento da lista: " + lista.get(tam - 1));

        System.out.println(lista.isEmpty());

        

        System.out.println(lista.toString());
      
        
    }
    
}
