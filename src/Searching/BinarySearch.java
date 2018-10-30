package Searching;

public class BinarySearch {

    public static void main(String args[]){

        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(binarySearch(0,array.length-1,array,9));
    }

    public static int binarySearch(int lowerBound, int upperBound, int[]array, int key){
        System.out.println("iteração - Lower:" + lowerBound +", Upper:" + upperBound);
        if(upperBound >=0){
            int medium = (upperBound + lowerBound)/2;
            if(array[medium] == key)
                return medium;
            else {
                if(key < array[medium])
                    return binarySearch(lowerBound,medium,array,key);
                else
                    return binarySearch(medium,upperBound, array,key);
            }
        }

        return -1;
    }
}
