package level5_Patterns;

public class Question_4 {
	 public static void main(String[] args) {
	        int n = 4;
	        printPattern(n);
	    }

	    public static void printPattern(int rows) {
	        // Print the top half of the pattern
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }
	        
	        // Print the bottom half of the pattern
	        for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }
	    }
}
