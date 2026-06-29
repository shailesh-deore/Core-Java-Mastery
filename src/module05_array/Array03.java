package module05_array;

public class Array03 {
    static void main(String[] args) {

        // THE ARRAY LENGTH - 1  (Last Element Access)

        int[] score = {10, 20, 30, 40, 50}; // Total length = 5

        // Rule 1: Human Counting starts from 1. Total elements = 5.
        // Rule 2: Java Indexing starts from 0. Valid slots are 0, 1, 2, 3, 4.

        // THE CRASH TRAP (Crashes your program):
        // int wrong = score[score.length]; // Trying to find score[5], which does not exist!
        // Error: Throws ArrayIndexOutOfBoundsException.

        // THE SAFE WAY: Always use (length - 1) for the last slot
        int lastIndex = score.length - 1; // 5 - 1 = Index 4
        System.out.println(score[lastIndex]); // Output: 50 (Safely gets the last value)

    }
}
