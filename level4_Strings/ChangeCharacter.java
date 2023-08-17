package level4_Strings;

public class ChangeCharacter {
	  public static void main(String[] args) {
	        String input = "Hello, World!";
	        char targetChar = 'o';
	        char replacementChar = '*';
	        
	        String modifiedString = changeCharacter(input, targetChar, replacementChar);
	        System.out.println("Modified string: " + modifiedString);
	    }

	    public static String changeCharacter(String str, char targetChar, char replacementChar) {
	        char[] charArray = str.toCharArray();
	        
	        for (int i = 0; i < charArray.length; i++) {
	            if (charArray[i] == targetChar) {
	                charArray[i] = replacementChar;
	            }
	        }
	        
	        return new String(charArray);
	    }
}
