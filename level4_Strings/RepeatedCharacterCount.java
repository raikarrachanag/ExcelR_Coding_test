package level4_Strings;

public class RepeatedCharacterCount {

	  public static void main(String[] args) {
	        String input = "programming";
	        countRepeatedCharacters(input);
	    }

	    public static void countRepeatedCharacters(String str) {
	        int[] charCount = new int[256];

	        for (char c : str.toCharArray()) {
	            charCount[c]++;
	        }

	        System.out.println("Repeated character count:");
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 1) {
	                System.out.println((char) i + ": " + charCount[i]);
	            }
	        }
	    }
}