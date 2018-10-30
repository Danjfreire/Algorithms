package DataStructures.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> lista = new List<>(5);
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }

        System.out.println("get(5) : " + lista.get(5));
        System.out.println("size :" + lista.size());
    }
}
