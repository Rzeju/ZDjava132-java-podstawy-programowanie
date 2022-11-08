package zad5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //i będzie kolejną liczbą sprawdzaną pod kątem tego czy jest liczbą pierwszą
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            //j będzie kolejnym dzielnikiem libczy i warunki : (j < i, j <= i / 2, i <= Math.sqrt(i))
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

        //OBIEKTOWO

        PrimeNumbers primeNumbers = new PrimeNumbers(n);
        primeNumbers.writePrimeNumbers();
    }
}
