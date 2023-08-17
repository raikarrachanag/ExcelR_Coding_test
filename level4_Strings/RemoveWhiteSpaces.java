package level4_Strings;

public class RemoveWhiteSpaces {
	 public static void main(String[] args) {
	        String input = "This is a sample string with white spaces.";
	        String stringWithoutSpaces = removeWhiteSpaces(input);
	        
	        System.out.println("String without white spaces: " + stringWithoutSpaces);
	    }

	    public static String removeWhiteSpaces(String str) {
	        return str.replaceAll("\\s+", "");
	    }
}
