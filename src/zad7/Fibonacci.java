package zad7;

public class Fibonacci {

    private final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int calculateElement() {
        int previous = 1;
        int current = 1;

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                int next = current + previous;
                previous = current;
                current = next;
            }
        }

        return current;
    }

    public static int calculateElementRecursion(int n) {

        if (n < 3) {
            return 1;
        }

        return calculateElementRecursion(n - 1) + calculateElementRecursion(n - 2);
    }
}
