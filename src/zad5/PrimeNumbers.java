package zad5;

public class PrimeNumbers {

    private final int n;

    public PrimeNumbers(int n) {
        this.n = n;
    }

    public void writePrimeNumbers() {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrimeNumber(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }
}
