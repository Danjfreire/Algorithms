package StringAlgorithms;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("nurses run"));
        System.out.println(isPalindrome("arara"));
        System.out.println(isPalindrome("20.02"));
    }

    public static Boolean isPalindrome(String entry) {
        // Removing empty spaces
        String filteredEntry = entry.replace(" ", "");
        int auxIndex = filteredEntry.length() - 1;
        for (int i = 0; i < filteredEntry.length() / 2; i++) {

            if (filteredEntry.charAt(i) != filteredEntry.charAt(auxIndex)) {
                return false;
            }
            auxIndex--;
        }

        return true;
    }
}
