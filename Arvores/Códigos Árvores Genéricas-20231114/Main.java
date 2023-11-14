public class Main {
    public static void main(String[] args) {

        GeneralTreeOfInteger arv = new GeneralTreeOfInteger();

        System.out.println("\nConsultando arvore ...");
        System.out.println("Vazia? " + arv.isEmpty() + "\n");

        System.out.println("Adicionando nodos na árvore ... \n");
        arv.add(1, null);
        arv.add(2,1);
        arv.add(3,1);
        arv.add(4,2);
        arv.add(5,2);
        arv.add(6,2);

        System.out.println("Imprimindo .... ");
        System.out.println("Caminhamento pré-fixado:");
        System.out.println(arv.positionsPre());

        System.out.println("\nConsultando arvore ...");
        System.out.println("Vazia? " + arv.isEmpty());
        if (!arv.isEmpty())
            System.out.println("Qtd nodos: "+ arv.size());
        System.out.println("Raiz: " + arv.getRoot() + "\n");

        System.out.println("\nConsultando nodos ...");
        System.out.println("O nodo 10 está na árvore? " + arv.contains(10));
        System.out.println("O nodo 1 está na árvore? " + arv.contains(1) + "\n");

    }
}