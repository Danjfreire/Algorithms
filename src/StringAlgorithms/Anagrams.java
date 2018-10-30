package StringAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String args[]){

        System.out.println(anagramTest1("banana","ananab"));
        System.out.println(anagramTest2("banana","banaban"));
        System.out.println(anagramTest3("banana","ananab"));
    }

    //Using StringBuilder
    public static Boolean anagramTest1(String entry1, String entry2){
        StringBuilder entry2sb = new StringBuilder(entry2);
        if(entry1.length() == entry2.length()){
            for(int i = 0 ; i < entry1.length() ; i++){
                char letter = entry1.charAt(i);
                for(int j = 0; j < entry2sb.length() ; j++){
                    if(j == entry2sb.length()-1 && letter != entry2sb.charAt(j)){
                        return false;
                    }else if(letter == entry2sb.charAt(j)){
                        entry2sb.setCharAt(j,'-');
                        break;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

    //Using char array
    public static Boolean anagramTest2(String entry1, String entry2){
        char []entry2array = entry1.toCharArray();
        if(entry1.length() == entry2.length()){
            for(int i = 0 ; i < entry1.length() ; i++){
                char letter = entry1.charAt(i);
                for(int j = 0; j < entry2array.length; j++){
                    if(j == entry2array.length-1 && letter != entry2array[j]){
                        return false;
                    }else if(letter == entry2array[j]){
                        entry2array[j] = '-';
                        break;
                    }
                }
            }
        }else{
            return false;
        }
        return true;
    }

    //Using map
    public static boolean anagramTest3(String entry1, String entry2){
        boolean isAnagram = true;
        if(entry1.length() == entry2.length()){
            Map<Character, Integer> entry1map = new HashMap<>();
            Map<Character, Integer> entry2map = new HashMap<>();

            for (int i = 0; i < entry1.length(); i++){
                char key = entry1.charAt(i);

                if(entry1map.containsKey(key)){
                    entry1map.put(key,entry1map.get(key) + 1);
                }else
                    entry1map.put(key,1);

                if(entry2map.containsKey(key)){
                    entry2map.put(key,entry2map.get(key) + 1);
                }else
                    entry2map.put(key,1);
            }

            for (Character key : entry1map.keySet()){
                if (entry1map.get(key) != entry2map.get(key)){
                    isAnagram = false;
                    break;
                }
            }
        }else
            isAnagram = false;

        return isAnagram;
    }
}
