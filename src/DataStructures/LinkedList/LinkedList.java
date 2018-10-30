package DataStructures.LinkedList;

public class LinkedList {
    private Node head = null;
    private Node tail = null;

    public LinkedList(){
    }

    public void addAtTail(Node n) {
        if(this.head == null){
            this.head = n;
            this.tail = n;
        }else{
            this.tail.setNext(n);
            this.tail = n;
        }
    }

    public void addAtHead(Node n){
        if(this.head == null){
            this.head = n;
            this.tail = n;
        }else{
            n.setNext(this.head);
            this.head = n;
        }
    }

    public Node find(String value){
        Node current = head;
        while(!current.getValue().equals(value) && current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }

    public void delete(String value){
        Node n = find(value);
        if(n.equals(head)){
            head = n.getNext();
        }else if(head.equals(tail)){
            Node previous = findPrevious(n);
            previous.setNext(null);
            tail = previous;
        }else{
            Node previous = findPrevious(n);
            previous.setNext(n.getNext());
            n = null;
        }
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.println(current.getValue()+" ");
            current = current.getNext();
        }
    }

    private Node findPrevious(Node n) {
        Node current = head;
        while(!current.getNext().equals(n)){
            current = current.getNext();
        }
        return current;
    }

    public void reverse(){
        Node current = tail;
        while(!current.equals(this.head)){
            current.setNext(findPrevious(current));
            current = current.getNext();
        }
        current.setNext(null);
        head = tail;
        tail = current;
    }
}
