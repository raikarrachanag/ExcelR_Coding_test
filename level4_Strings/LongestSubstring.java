package level4_Strings;

public class LongestSubstring {
	 public static void main(String[] args) {
	        String sentence = "The quick brown fox jumps over the lazy dog.";
	        String longestSubstring = findLongestSubstring(sentence);
	        
	        System.out.println("Longest substring: " + longestSubstring);
	    }

	    public static String findLongestSubstring(String sentence) {
	        String[] words = sentence.split("\\s+");
	        String longestSubstring = "";

	        for (String word : words) {
	            if (word.length() > longestSubstring.length()) {
	                longestSubstring = word;
	            }
	        }

	        return longestSubstring;
	    }
}
