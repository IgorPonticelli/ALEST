package Exercicio_Nodo;

public class App2{
    public static void main(String[] args) {
        
        List lista = new List(null);

        System.out.println("Tamanho da lista é: " + lista.size()); 
        lista.inserirFim(4);
        System.out.println(lista.size());
    }
    
}