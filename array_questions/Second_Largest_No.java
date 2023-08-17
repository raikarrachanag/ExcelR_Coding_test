package array_questions;

public class Second_Largest_No {

    public static int Second_Largest_No(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] inputArray = {5, 9, 2, 12, 8, 7, 15};
        int secondLargest =Second_Largest_No(inputArray);
        
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}

