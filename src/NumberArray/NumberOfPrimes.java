package NumberArray;

import java.util.ArrayList;

public class NumberOfPrimes {
    public static void main(String[] args){
        int[] entry = new int[]{1,3,4,5,7};
        System.out.println(getNumberOfPrimes(entry));
    }

    public static int getNumberOfPrimes(int[] entry){
        int result = 0;
        boolean isPrime;
        for(int i = 0; i < entry.length ; i++){
            isPrime = true;
            for (int j = 2; j < entry[i] ; j++){
                if(entry[i]%j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && entry[i] != 1 && entry[i] != 0){
                result++;
            }
        }

        return result;
    }
}
