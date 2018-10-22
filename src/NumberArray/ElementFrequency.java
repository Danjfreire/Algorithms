package NumberArray;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

    public static void main(String args[]){
        int[] entry = new int[]{1,2,1,3,1,2,1,3};
        getFrequency2(entry);
    }

    public static void getFrequency1(int[] array){
        boolean[] visited = new boolean[array.length];

        for (int i = 0 ; i < array.length; i++){
            if(!visited[i]){
                visited[i] = true;
                int count = 1;
                for(int j = i+1; j < array.length; j++){
                    if(array[j] == array[i]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(array[i] + " " + count);
            }
        }
    }

    public static void getFrequency2(int[] array){
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            if(frequencyMap.containsKey(array[i])){
                frequencyMap.put(array[i],frequencyMap.get(array[i]) + 1);
            }else{
                frequencyMap.put(array[i],1);
            }
        }

        for(Map.Entry entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
