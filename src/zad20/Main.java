package zad20;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int answer = random.nextInt(100 + 1);

        while (true) {
            int userAnswer = scanner.nextInt();
            if (userAnswer > answer) {
                System.out.println("Za dużo");
            } else if (userAnswer < answer) {
                System.out.println("Za mało");
            } else {
                System.out.println("BINGO!");
                break;
            }
        }
    }
}
