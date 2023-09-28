package Exercicio_Nodo;

import java.util.function.Function;

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
        count = 10;
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

    public int size(){
        return count;
    }
    
    public Integer get(int index){
        //Trata para ver se o index é válido
        if(index >= count || index < 0){
            throw new IndexOutOfBoundsException();
        }
        //Teste para ver se tem só um elemento
        if(index == count -1){
            return tail.element;
        }


        Node aux = head;
        int aux_contador = 0;
        while(aux_contador < index){
            aux = aux.next;
            aux_contador ++;
        }
        return aux.element;
    }

    public void inserirFim(Integer element){
        //Testa se esta vazia
        Node node2 = new Node(element);
        if(isEmpty()){
            count ++;
            head = node2;
        }else{
            tail.next = node2;
        }

        tail = node2;

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


    
    
}



