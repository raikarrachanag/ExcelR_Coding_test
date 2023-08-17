package level5_Patterns;

public class Question_3 {
	 public static void main(String[] args) {
	        int n = 5;
	        printPattern(n);
	    }

	    public static void printPattern(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }
	    }
}
