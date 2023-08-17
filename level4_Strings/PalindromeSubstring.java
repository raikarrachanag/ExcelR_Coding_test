package level4_Strings;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubstring {

	public static void main(String[] args) {
        String sentence = "sas my pap";
        List<String> palindromes = findPalindromeSubstrings(sentence);
        
        System.out.println("Palindrome substrings:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

    public static List<String> findPalindromeSubstrings(String sentence) {
        List<String> palindromes = new ArrayList<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j <= word.length(); j++) {
                    String substring = word.substring(i, j);
                    if (isPalindrome(substring)) {
                        palindromes.add(substring);
                    }
                }
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
