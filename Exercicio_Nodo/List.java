package Exercicio_Nodo;
public class List{
    private Node tail;
    private Node head;
    private int count;
    
    // public List(Node tail, Node head, int count) {
        
    //     this.tail = tail;
    //     this.head = head;
    //     this.count = count;
    // }

    public List(Integer element){
        Node node = new Node(element);
        head = null;
        tail = null;
        count = 0;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    
    
}


class Node {
    private Integer element;
    private Node next;
    
    public Node(Integer element, Node next) {
        this.element = element;
        this.next = null;
    }

    public Node(Integer e){
        element = e;
        next = null;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
