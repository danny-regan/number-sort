/*
 * To run the program, move to the directory of the program, then run:
 
 javac SortLinkedList.java
 java SortLinkedList

 * To generate the documentation for the program, move to the directory of the program, then run:
 
 javadoc SortLinkedList.java

 * References:
 * For converting a string to an array:
 *   https://www.geeksforgeeks.org/java-program-to-convert-string-to-integer-array/
 * For creating linked lists:
 *   https://www.geeksforgeeks.org/linked-list-in-java/
 * Methods for linked lists:
 *   https://www.w3schools.com/java/java_ref_linkedlist.asp
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * Receive a string of numbers from the user and display them as a sorted linked list from smallest to largest.
 * 
 * This class takes a string of numbers, converts it to an array, creates a linked list from the array, sorts the linked list, and prints it to the terminal.
 * 
 * @author Danny Regan
 * @version 1.0.0
 * @since June 10, 2025
 */
public class SortLinkedList {
    /**
     * Main method of the class.
     * Accepts a string of integers from the user, converts them to an array, turns the array into a linked list, sorts the linked list, and prints the result to the user.
     * @param args Default parameter for a main - not used.
     * @since June 10, 2025
     */
    public static void main(String[] args) {
        String in = getInput();

        int[] arr = stringToArr(in);

        LinkedList<Integer> list = createList(arr); // The LinkedList collections framework is reused code which has many methods with potentially difficult code that one can easily call without knowing the exact complexities of the code.
        // Print statements are reused code since one doesn't need to write out the exact mechanism for how this is printed to the terminal.
        System.out.println("Original list: " + list);

        LinkedList<Integer> sorted = sortList(list);
        System.out.println("Sorted list: " + sorted);
    }

    /**
     * Prompts the user to enter a series of numbers.
     * @return A string of integers that the user has entered.
     * @since June 10, 2025
     */
    public static String getInput() {
        Scanner sc = new Scanner(System.in); // The Scanner object is reused code and the System.in command is reused code.
        System.out.println("Enter nodes of the linked list (as integers) separated by a space (ex: 1 2 3 4 5): ");

        String input = sc.nextLine();
        sc.close();

        return input;
    }

    /**
     * Converts a string of integers to an array of integers.
     * @param st A string of integers.
     * @return An array of integers.
     * @since June 10, 2025
     */
    public static int[] stringToArr(String st) {
        // The Arrays collections framework is reused code since it has many methods with more complicated code that work for me behind the scenes.
        int[] arr = Arrays.stream(st.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        return arr;
    }

    /**
     * Creates a linked list from a given array.
     * @param arr An array of integers.
     * @return A linked list of integers.
     * @since June 10, 2025
     */
    public static LinkedList<Integer> createList(int[] arr) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]); // Add method is reused code from the LinkedList collections framework.
        }
        return l;
    }

    /**
     * Sorts a linked list of integers from lowest to highest.
     * @param arr The linked list to be sorted.
     * @return The sorted linked list in ascending order.
     * @since June 10, 2025
     */
    public static LinkedList<Integer> sortList(LinkedList<Integer> l) {
        l.sort(null); // Sort method is reused code from the LinkedList collections framework.
        return l;
    }
}