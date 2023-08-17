package array_questions;

public class OddNumbersInArray {

	    public static void displayOddNumbers(int[] arr) {
	        System.out.println("Odd numbers in the array:");
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 10, 15, 20, 25, 30, 35};

	        displayOddNumbers(array);
	    }
	}



