package NumberArray;

import java.util.HashMap;
import java.util.Map;

public class SumOfReapeatingElements {
    public static void main(String[] args){
        int[] entry = new int[]{2,3,9,9};
        getSumOfrepetingItems(entry,1);
    }

    public static void getSumOfrepetingItems(int[]entry, int k){

        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for (int i = 0; i < entry.length ; i++){
            if(freqMap.containsKey(entry[i])){
                freqMap.put(entry[i], freqMap.get(entry[i]) + 1);
            }else{
                freqMap.put(entry[i],1);
            }
        }

        int sum = 0;
        for(Map.Entry e : freqMap.entrySet()){
            if((int)e.getValue() == k){
                sum += (int) e.getKey();
            }
        }
        System.out.println("Sum : " + sum);
    }
}
