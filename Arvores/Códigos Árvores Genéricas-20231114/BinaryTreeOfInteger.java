import java.security.InvalidParameterException;
import java.util.NoSuchElementException;


/**
 * Classe de arvore binaria de numeros inteiros.
 *
 * @author Isabel H. Manssour
 */

public class BinaryTreeOfInteger {
    
    private static final class Node {

        public Node father;
        public Node left;
        public Node right;
        private Integer element;

        public Node(Integer element) {
            father = null;
            left = null;
            right = null;
            this.element = element;
        }
    }

    // Atributos
    private int count; //contagem do número de nodos
    private Node root; //referência para o nodo raiz

    // Metodos
    public BinaryTreeOfInteger() {
        count = 0;
        root = null;
    }

    /**
     * Remove todos os elementos da arvore.
     */
    public void clear() {
        count = 0;
        root = null;
    }

    /**
     * Verifica se a arvore esta vazia ou nao.
     *
     * @return true se arvore vazia e false caso contrario.
     */
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * Retorna o total de elementos da arvore.
     *
     * @return total de elementos
     */
    public int size() {
        return count;
    }

    /**
     * Retorna o elemento armazenado na raiz da arvore.
     *
     * @throws EmptyTreeException se arvore vazia.
     * @return elemento da raiz.
     */
    public Integer getRoot() {
        if (isEmpty()) {
            throw new InvalidParameterException();
        }
        return root.element;
    }

    /**
     * Retorna quem e o elemento pai do elemento passado por parametro.
     *
     * @param element
     * @return pai de element
     */
    public Integer getParent(Integer element) {
        Node n = this.searchNodeRef(element, root);
        if (n == null) {
            return null;
        } else if (n.father==null) {
            return null;
        }else {
            return n.father.element;
        }
    }

    /**
     * Altera o elemento da raiz da arvore.
     *
     * @param element a ser colocado na raiz da arvore.
     */
    public void setRoot(Integer element) {
        if(isEmpty()){
            throw new InvalidParameterException();
        }
        else if(element == null){
            throw new InvalidParameterException();
        }
        else{
            root.element = element;
        }
    }

    private Node searchNodeRef(Integer elem, Node n) {
        if (n == null)
            return null;

        // Visita a raiz
        if (elem.equals(n.element))
            return n;

        // Visita os filhos
        Node aux = searchNodeRef(elem, n.left);

        if(aux == null){    //Verifica se o elemento procurado está do lado esquerdo
            aux = searchNodeRef(elem, n.right); // Se não percorre o lado direito para procurar
        }
        return aux;
       
    }

    public void addRoot(Integer element){
        if(isEmpty()){
            Node n = new Node(element);
            root = n;
            count++;
        }else{
            throw new InvalidParameterException();
        }
    }

    public void addLeft(Integer element){
         
    }

    
}