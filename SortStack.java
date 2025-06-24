/*
 * To run the program, move to the directory of the program, then run:
 
 javac SortStack.java
 java SortStack

 * To generate the documentation for the program, move to the directory of the program, then run:
 
 javadoc -d doc *.java

 * References:
 * For converting a string to an array:
 *   https://www.geeksforgeeks.org/java-program-to-convert-string-to-integer-array/
 * For creating stacks:
 *   https://www.geeksforgeeks.org/java/stack-class-in-java/
 * Methods for arrays:
 *   https://www.w3schools.com/java/ref_arrays_sort.asp
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

/**
 * Receive a string of numbers from the user and display them as a sorted stack from smallest to largest.
 * 
 * This class takes a string of numbers, converts it to an array, sorts the array, creates a stack from the array, and prints it to the terminal.
 * 
 * @author Danny Regan
 * @version 1.0.0
 * @since June 17, 2025
 */
public class SortStack {
    /**
     * Main method of the class.
     * 
     * Accepts a string of integers from the user, converts them to an array, sorts the array, turns it into a stack, and prints the result to the user.
     * @param args Default parameter for a main - not used.
     * @since June 17, 2025
     */
    public static void main(String[] args) {
        String in = getInput();

        int[] arr = stringToSortedArr(in);

        Stack<Integer> stack = createStack(arr); // The Stack collections framework is reused code which has many methods with potentially difficult code that one can easily call without knowing the exact complexities of the code.
        // Print statements are reused code since one doesn't need to write out the exact mechanism for how this is printed to the terminal.
        System.out.println("Original list: " + in);

        System.out.println("Sorted stack: " + stack);
    }

    /**
     * Prompts the user to enter a series of numbers.
     * @return A string of integers that the user has entered.
     * @since June 17, 2025
     */
    public static String getInput() {
        Scanner sc = new Scanner(System.in); // The Scanner object is reused code and the System.in command is reused code.
        System.out.println("Enter elements of the stack (as integers) separated by a space (ex: 1 2 3 4 5): ");

        String input = sc.nextLine();
        sc.close();

        return input;
    }

    /**
     * Converts a string of integers to an array of integers and sorts the array.
     * @param st A string of integers.
     * @return An integer array sorted in ascending order.
     * @since June 17, 2025
     */
    public static int[] stringToSortedArr(String st) {
        // The Arrays collections framework is reused code since it has many methods with more complicated code that work for me behind the scenes.
        int[] arr = Arrays.stream(st.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Creates a stack given an array.
     * @param arr An array of integers.
     * @return A stack of integers.
     * @since June 17, 2025
     */
    public static Stack<Integer> createStack(int[] arr) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]); // Push method is reused code from the Stack collections framework.
        }
        return s;
    }
}