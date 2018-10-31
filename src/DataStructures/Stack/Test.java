package DataStructures.Stack;

public class Test {

    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>(10);

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }

        System.out.println(stack.pop());
    }
}
