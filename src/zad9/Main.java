package zad9;

public class Main {

    public static void main(String[] args) {

        int size = 5;

        int spaceBetween = 6;
        int spaceBefore = 1;

        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < size; i++) {

                for (int x = 0; x < spaceBefore - 1; x++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int y = 0; y < spaceBetween; y++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int x = 0; x < spaceBefore; x++) {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");

            spaceBetween = spaceBetween - 2;
            spaceBefore = spaceBefore + 1;


        }
    }
}
