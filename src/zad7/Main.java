package zad7;

public class Main {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(7);

        System.out.println(fibonacci.calculateElement());

        int result = Fibonacci.calculateElementRecursion(5);

        System.out.println(result);
    }

}
