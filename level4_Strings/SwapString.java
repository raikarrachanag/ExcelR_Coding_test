package level4_Strings;

public class SwapString {
	 public static void main(String[] args) {
	        String[] strings = {"Hello", "World"};
	        
	        System.out.println("Before swapping:");
	        System.out.println("str1: " + strings[0]);
	        System.out.println("str2: " + strings[1]);
	        
	        swapStrings(strings);
	        
	        System.out.println("After swapping:");
	        System.out.println("str1: " + strings[0]);
	        System.out.println("str2: " + strings[1]);
	    }

	    public static void swapStrings(String[] arr) {
	        String temp = arr[0];
	        arr[0] = arr[1];
	        arr[1] = temp;
	    }
}
