// Adaptação Prof. Isabel
import java.util.LinkedList;

public class GeneralTreeOfInteger {
    private class Node {
        // Atributos da classe Node
        public Node father;
        public Integer element;
        public LinkedList<Node> subtrees;
        // Métodos da classe Node
        public Node(Integer element) {
            father = null;
            this.element = element;
            subtrees = new LinkedList<>();
        }
        private void addSubtree(Node n) {
            n.father = this;
            subtrees.add(n);
        }
        private boolean removeSubtree(Node n) {
            n.father = null;
            return subtrees.remove(n);
        }
        public Node getSubtree(int i) {
            if ((i < 0) || (i >= subtrees.size())) {
                throw new IndexOutOfBoundsException();
            }
            return subtrees.get(i);
        }
        public int getSubtreesSize() {
            return subtrees.size();
        }
    }

    /* ARVORE */

    // Atributos da classe GeneralTreeOfInteger
    private Node root;
    private int count;

    // Metodos da classe GeneralTreeOfInteger
    /**
     * Metodo construtor.
     */
    public GeneralTreeOfInteger() {
        root = null;
        count = 0;
    }

    /**
     * Retorna o numero total de elementos da arvore.
     * @return count
     */
    public int size() {
        return count;
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
     * Retorna o elemento armazenado na raiz da arvore.
     *
     * Exception (to do)
     * @return elemento da raiz.
     */
    public Integer getRoot() {
        if (isEmpty()) {
            System.out.println("Arvore Vazia");
        }
        return root.element;
    }

    // Procura por "elem" a partir de "n" seguindo um
    // caminhamento pre-fixado. Retorna a referencia
    // para o nodo no qual "elem" esta armazenado.
    // Se não encontrar "elem", ele retorna NULL.
    private Node searchNodeRef(Integer elem, Node n) {
        if (n == null)
            return null;

        // Visita a raiz
        if (elem.equals(n.element))
            return n;

        // Visita os filhos
        Node aux = null;
        for (int i=0; i<n.getSubtreesSize(); i++) {
            aux = searchNodeRef(elem, n.getSubtree(i));
            if (aux != null)
                return aux;
        }
        return aux;
    }


    /**
     * Adiciona elem como filho de elemFather
     * @param elem elemento a ser adicionado na arvore.
     * @param elemFather pai do elemento a ser adicionado.
     * @return true se encontrou elemFather e adicionou elem na arvore,
     * false caso contrario.
     */
    public boolean add(Integer elem, Integer elemFather) {
        // Primeiro cria o nodo
        Node n = new Node(elem);

        if (elemFather == null) { // se insercao de elem como raiz
            if (root != null) { // se a arvore nao esta vazia
                root.father = n;
                n.addSubtree(root);
            }
            root = n;
            count++;
            return true;
        }
        else {
            Node aux = searchNodeRef(elemFather, root);
            if (aux != null) { // se achou elemFather
                // Insere elem na arvore
                n.father = aux;
                aux.addSubtree(n);
                count++;
                return true;
            }
        }
        return false;
    }


    /**
     * Verifica se elem esta ou não na arvore.
     * @param elem a ser procurado.
     * @return true se achar elem, e false caso contrario.
     */
    public boolean contains (Integer elem) {
        // Procura por "elem" a partir da raiz
        Node aux = searchNodeRef(elem, root);
        return (aux != null); // Retorna true se aux não for nulo, caso contrário, retorna false.
    }

    // Percorrendo pre order

    /**
     * Retorna uma lista com todos os elementos da árvore numa ordem de
     * caminhamento pre-fixado.
     * @return lista com os elementos da arvore na ordem do caminhamento pre-fixado
     */
    public LinkedList<Integer> positionsPre() {
        LinkedList<Integer> lista = new LinkedList<>();
        positionsPreAux(root,lista);
        return lista;
    }
    private void positionsPreAux(Node n, LinkedList<Integer> lista) {
        if (n != null) {
            //Visita a raiz
            lista.add(n.element);
            // Visita os filhos
            for (int i=0; i<n.getSubtreesSize(); i++) {
                positionsPreAux(n.getSubtree(i), lista);
            }
        }
    }

    /* outras operacoes */
    /**
     * Retorna em que nivel em que elem esta armazenado.
     * @param element a ser buscado
     * @return nivel no qual element esta, ou -1 se
     * nao encontrou element.
     */
    public int level(Integer element) {
        // IMPLEMENTE ESTE METODO !!
        return 0;

    }

    /**
     * Remove o galho da arvore que tem element na raiz. A
     * remocao inclui o nodo que contem "element".
     * @param element elemento que sera removido junto com sua
     * subarvore.
     * @return true se achou element e removeu o galho, false
     * caso contrario.
     */
    public boolean removeBranch(Integer element) {
        // IMPLEMENTE ESTE METODO !!
        return false;
    }

    // Conta o numero de nodos da subarvore suja raiz eh passada por parametro
    private int countNodes(Node n) {
        // IMPLEMENTE ESTE METODO !!
        return 0;
    }
}
