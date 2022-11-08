package zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Deklaracja zmiennej a
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość a = ");
        a = scanner.nextInt();

        System.out.print("Podaj wartość b = ");
        b = scanner.nextInt();

        System.out.print("Podaj wartość c = ");
        c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x_1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x_2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("Rozwiązania równania to x1 = %f oraz x2 = %f%n", x_1, x_2);


        //ROZWIĄZANIE OBIEKTOWE

        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 0 ,-9);
        quadraticEquation.calculateSolution();

    }
}
