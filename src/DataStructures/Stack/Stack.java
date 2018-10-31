package DataStructures.Stack;

public class Stack <T>{

    private Object[] elems;
    private int currentHeigth;

    public Stack(int maxHeigth){
        this.elems = new Object[maxHeigth];
        this.currentHeigth = 0;
    }

    public void push(T elem){
        if (currentHeigth < elems.length){
            this.elems[currentHeigth] = elem;
            currentHeigth++;
        }
    }

    public T pop(){
       Object elem =  elems[this.currentHeigth-1];
        if(elem != null){
            currentHeigth--;
            elems[currentHeigth] = null;
        }
        return (T) elem;
    }

}
