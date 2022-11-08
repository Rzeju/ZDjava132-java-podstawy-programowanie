package zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę a = ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
