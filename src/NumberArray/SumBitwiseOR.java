package NumberArray;

public class SumBitwiseOR {
    public static void main (String[]args){
        int[] entry = new int[]{1,2,3,4,5};
        System.out.println(bitwiseOrTest(entry));
    }
    //Bitwise or sum of every subarray
    public static int bitwiseOrTest(int[] entry){
        int finalSum = 0;
        for(int i = 0; i < entry.length; i++){
            int auxSum = 0;
            for (int j = i; j < entry.length ; j++){
                auxSum = entry[j] | auxSum;
                finalSum += auxSum;
            }
        }
        return finalSum;
    }
}