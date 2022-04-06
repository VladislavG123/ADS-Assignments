package com.vladislavg123;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // task1(scanner);
        // task3(scanner);
        // task4(scanner);
        // task7(scanner);
        // task8(scanner);
        task10(scanner);
    }

    private static void task1(Scanner scanner) {

        int n = scanner.nextInt();
        var array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        var min = Arrays.stream(array).min().getAsInt();

        System.out.println(min);
    }

    private static void task2(Scanner scanner, int n) {
        var array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        var sum = Arrays.stream(array).sum();

        System.out.println(sum / n);
    }

    private static void task3(Scanner scanner) {
        int n = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }

    private static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }

    private static void task4(Scanner scanner) {
        int n = scanner.nextInt();

        System.out.println(getFactorial(n));
    }

    private static int getFibonacciNumber(int n) {
        return n == 1 || n == 2 ? 1 : n == 0 ? 0 : getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }

    private static void task5(Scanner scanner) {
        int n = scanner.nextInt();
        System.out.println(getFibonacciNumber(n));
    }

    private static int getPower(int a, int n) {
        return n == 1 ? a : a * getPower(a, n - 1);
    }

    private static void task6(Scanner scanner) {
        int a = scanner.nextInt(), b = scanner.nextInt();

        System.out.println(getPower(a, b));
    }

    private static int[] flip(int[] arr, int count) {
        int diff = arr.length - count;
        if (count - 1 <= diff) {
            return arr;
        }

        int buffer = arr[count - 1];
        arr[count - 1] = arr[diff];
        arr[diff] = buffer;

        return flip(arr, count - 1);
    }

    private static void task7(Scanner scanner) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        flip(arr, n);

        for (int item: arr) {
            System.out.print(item + " ");
        }
    }

    private static boolean isLineFromDigits(String line) {
        if (line.length() == 0) {
            return true;
        }

        if (!Character.isDigit(line.charAt(line.length() - 1))) {
            return false;
        }

        return isLineFromDigits(line.substring(0, line.length() - 2));

    }

    private static void task8(Scanner scanner) {
        String text = scanner.nextLine();

        System.out.println(isLineFromDigits(text) ? "YES" : "NO");
    }

    private static int getBinomialCoefficient(int n, int k) {
        return k == n || k == 0 ? 1 : getBinomialCoefficient(n - 1, k - 1) + getBinomialCoefficient(n - 1, k);
    }

    private static void task9(Scanner scanner) {
        int n = scanner.nextInt(), k = scanner.nextInt();

        System.out.println(getBinomialCoefficient(n, k));
    }

    private static int getGcd(int a, int b) {
        return a % b == 0 ? b : getGcd(b, a % b);
    }

    private static void task10(Scanner scanner) {
        int a = scanner.nextInt(), b = scanner.nextInt();

        System.out.println(getGcd(a, b));
    }
}


