package NumberArray;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class SumPair {

    public static void main(String[] args) {

        for (int[] result : findPairs(6, new Integer[]{2, 5, 4, 1, 2, 5})) {
            System.out.println(Arrays.toString(result));
        }
    }

    public static List<int[]> findPairs(int sumResult, Integer[] numList) {

        List<int[]> result = new ArrayList<>();
        List<Integer> newNumList = new ArrayList<>();
        for(int j = 0 ; j < numList.length ; j++){
            if(!newNumList.contains(numList[j]))
                newNumList.add(numList[j]);
        }

        int iteration = 0;
        while (iteration != newNumList.size() - 1) {
            for (int i = iteration + 1; i < newNumList.size(); i++) {
                if(newNumList.get(iteration) + newNumList.get(i) == sumResult){
                    result.add(new int[]{newNumList.get(iteration), newNumList.get(i)});
                }
            }
            iteration++;
        }
        return result;
    }
}
