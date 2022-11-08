package zad3;

public class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateSolution() {
        double delta = Math.pow(b, 2) - 4 * a * c;

        double x_1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x_2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("Rozwiązania równania to x1 = %f oraz x2 = %f%n", x_1, x_2);
    }
}
