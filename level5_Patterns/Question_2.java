package level5_Patterns;

public class Question_2 {
	  public static void main(String[] args) {
	        int n = 4;
	        printPattern(n);
	    }

	    public static void printPattern(int rows) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }
	    }
}
