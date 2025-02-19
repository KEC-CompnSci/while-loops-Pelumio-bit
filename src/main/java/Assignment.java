
import java.util.Scanner;

import java.util.Scanner;

public class Assignment {
    // DO NOT MODIFY THIS SCANNER
    // This will be used to autograde your solution
    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Testing the functions
        String repeated = repeatWord("hello", 3);
        System.out.println(repeated);
        
        String pyramid = createPyramid(3);
        System.out.println(pyramid);
        
        String fizzBuzz = countTo(6);
        System.out.println(fizzBuzz);
    }
    
    /**
     * Exercise 1: Word Repeater
     * Repeat the provided word the specified number of times
     * Example: word="hello", times=3 → "hello hello hello"
     */
    public static String repeatWord(String word, int times) {
        if (times <= 0) return ""; // Return empty string if times is non-positive
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(word);
            if (i < times - 1) { // Add space between words, but not after the last one
                result.append(" ");
            }
        }
        return result.toString();
    }
    
    /**
     * Exercise 2: Number Pyramid
     * Create a string pyramid of numbers from 1 to maxNumber
     * Example: maxNumber=3 →
     * 1
     * 22
     * 333
     */
    public static String createPyramid(int maxNumber) {
        if (maxNumber <= 0) return ""; // Return empty string if maxNumber is non-positive
        
        StringBuilder result = new StringBuilder();
        for (int num = 1; num <= maxNumber; num++) {
            result.append(String.valueOf(num).repeat(num)); // Repeat number num times
            if (num < maxNumber) { // Add newline except for the last line
                result.append("\n");
            }
        }
        return result.toString();
    }
    
    /**
     * Exercise 3: Counting Game (FizzBuzz)
     * Return a string of numbers replacing:
     * - Multiples of 3 with "Fizz"
     * - Multiples of 5 with "Buzz"
     * - Multiples of both with "FizzBuzz"
     * Example: countTo(6) → "1 2 Fizz 4 Buzz Fizz"
     */
    public static String countTo(int maxNumber) {
        if (maxNumber <= 0) return ""; // Return empty string if maxNumber is non-positive
        
        StringBuilder result = new StringBuilder();
        for (int num = 1; num <= maxNumber; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                result.append("FizzBuzz");
            } else if (num % 3 == 0) {
                result.append("Fizz");
            } else if (num % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(num);
            }
            if (num < maxNumber) { // Add space between numbers, but not at the end
                result.append(" ");
            }
        }
        return result.toString();
    }
