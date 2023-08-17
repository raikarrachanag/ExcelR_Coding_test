package level4_Strings;

public class CountVowelsAndConsonents {
	 public static void main(String[] args) {
	        String input = "Hello, World!";
	        int[] counts = countVowelsAndConsonants(input);
	        
	        System.out.println("Number of vowels: " + counts[0]);
	        System.out.println("Number of consonants: " + counts[1]);
	    }

	    public static int[] countVowelsAndConsonants(String str) {
	        int[] counts = new int[2];
	        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    counts[0]++; // Increment vowel count
	                } else {
	                    counts[1]++; // Increment consonant count
	                }
	            }
	        }

	        return counts;
	    }
}
