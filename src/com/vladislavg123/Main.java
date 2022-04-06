package com.vladislavg123;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //task1(scanner);
        //task3(scanner);
        task4(scanner);
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

    private static void task5(Scanner scanner) {
        
    }
}


