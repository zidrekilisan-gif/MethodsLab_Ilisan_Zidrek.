/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab.java;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MethodsLab {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    }
            
        // TASK 1: Void Method
    public static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // TASK 2: Arithmetic Methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    // TASK 3: Factorial
    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // TASK 4: Sum of Array
    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // TASK 5: Check Prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // TASK 6: Maximum in Array
    public static int maxInArray(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    // TASK 7: GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // TASK 7: LCM
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // CHALLENGE 1: Recursive Factorial
    public static long recursiveFactorial(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // CHALLENGE 2: Recursive Fibonacci
    public static int fib(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // CHALLENGE 3: Palindrome
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // MAIN METHOD
      public static void main(String args) { 

    Scanner input = new Scanner(System.in);

    greetUser();

        // TASK 2
        System.out.print("\nEnter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // TASK 3
        System.out.print("\nEnter a number for factorial: ");
        int factNum = input.nextInt();

        System.out.println("Factorial: " + factorial(factNum));

        // TASK 4
        int[] numbers = {10, 15, 20, 12, 18};

        System.out.println("Sum of array elements: " + sumArray(numbers));

        // TASK 5
        System.out.print("\nEnter a number to check prime: ");
        int primeNum = input.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }

        // TASK 6
        System.out.println("\nLargest element: " + maxInArray(numbers));

        // TASK 7
        System.out.print("\nEnter two positive integers for GCD and LCM: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        } else {
            System.out.println("Please enter positive integers.");
        }

        // CHALLENGE 1
        System.out.print("\nEnter a number for recursive factorial: ");
        int recursiveNum = input.nextInt();

        System.out.println("Recursive Factorial: "
                + recursiveFactorial(recursiveNum));

        // CHALLENGE 2
        System.out.print("\nEnter a number for Fibonacci: ");
        int fibNum = input.nextInt();

        System.out.println("Fibonacci: " + fib(fibNum));

        // CHALLENGE 3
        input.nextLine();

        System.out.print("\nEnter a word to check palindrome: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        input.close();
    }
}