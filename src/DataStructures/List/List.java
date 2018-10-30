package DataStructures.List;

public class List<T>{

    private Object[] elements;
    private int currentSize;

    public List(int length){
        this.elements = new Object[length];
        this.currentSize = 0;
    }

    public void add(T elem){
        if(this.currentSize >= this.elements.length){
            expandList();
        }
        this.elements[currentSize] = elem;
        currentSize++;
        System.out.println(elem + " added");
    }

    private void expandList() {
        Object[] aux = new Object[this.elements.length * 2];

        // can be replaced with Arrays.copyOf(elements,elements.length * 2)
        for(int i = 0; i < this.elements.length; i++){
            aux[i] = elements[i];
        }
        System.out.println("List expanded");
        this.elements = aux;
    }

    public T get(int pos){
        return (T) elements[pos];
    }

    public int size(){
        return this.currentSize;
    }
}
