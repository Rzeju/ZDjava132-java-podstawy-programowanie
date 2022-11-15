package zad16;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 7, 8,9,10,11,12,13,14};

        int counter = 0;
        int result = 0;

        for (int i= 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                if (counter > result) {
                    result = counter + 1;

                }
                counter = 0;
            }
        }

        System.out.println("Najdłużsyz podciąg wynosi: " + result);
    }
}
