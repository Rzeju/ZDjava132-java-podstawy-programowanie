package zad10;

public class Main {

    public static void main(String[] args) {

        int number = 12345;

        int result = 0;
        double nextDigit;
        int i = 0;
        do {
            nextDigit = (number / Math.pow(10, i));
            int box = (int) nextDigit % 10;
            result = result + box;
            i++;
        } while (nextDigit > 0);

        System.out.println(result);


        String digits = String.valueOf(number);
        String[] numbers = digits.split("");

        result = 0;
        for (int j = 0; j < numbers.length; j++) {
            result = result + Integer.parseInt(numbers[j]);
        }

        System.out.println(result);

    }
}
