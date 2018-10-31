package DataStructures.Queue;

public class Queue <T>{

    private Object[] elems;
    private int queueHead;
    private int queueTail;

    public Queue(int maxLength){
        this.elems = new Object[maxLength];
        this.queueHead = 0;
        this.queueTail = 0;
    }

    public void insert(T elem){
        if(elems[queueTail] == null){
            elems[queueTail] = elem;
            if(queueTail != elems.length-1)
                queueTail++;
            else{
                queueTail = 0;
            }
        }
    }

    public T remove(){
        Object elem = elems[queueHead];
        queueHead++;
        return (T) elem;
    }
}
