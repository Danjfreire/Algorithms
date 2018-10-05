package NumberArray;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public static void main(String[]args){

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] shuffle(int[] entry){
        Random rand = new Random();
        int randAux = 0;
        int aux;
        for(int i = 0; i < entry.length; i++){
            randAux = rand.nextInt(entry.length);
            aux = entry[i];
            entry[i] = entry[randAux];
            entry[randAux] = aux;
        }
        return entry;
    }
}

