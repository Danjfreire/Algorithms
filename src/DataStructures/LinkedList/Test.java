package DataStructures.LinkedList;

public class Test {

    public static void main(String[]args){
        LinkedList ll = new LinkedList();

        for(int i = 1; i < 6;i++){
            ll.addAtTail(new Node("node" + i));
        }
        ll.printList();
        System.out.println("---------------------------------");
        System.out.println(ll.find("node3").toString());
        System.out.println("---------------------------------");
        ll.reverse();
        ll.printList();
    }
}
