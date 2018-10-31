package DataStructures.Queue;

public class Test {
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<>(10);

        for (int i = 0; i < 10; i++){
            queue.insert(i);
        }

        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
