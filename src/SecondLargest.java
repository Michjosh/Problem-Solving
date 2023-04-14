/*
Take an input of multiple numbers from a user. Find the second largest number of the
numbers.
 */

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers you want to enter: ");
        int integers = input.nextInt();

        int[] numbers = new int[integers];
        System.out.println("Enter " + integers + " numbers:");

        for (int i = 0; i < integers; i++) {
            numbers[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < integers; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number is " + secondLargest);
    }
}
