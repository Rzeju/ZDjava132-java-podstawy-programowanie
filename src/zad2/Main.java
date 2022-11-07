package zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Podaj swoją wagę w kilogramach = ");
        float weight = scanner.nextFloat();

        System.out.print("Podaj swój wzrost w centrymetrach = ");
        int height = scanner.nextInt();

        float heightInMeters = height / 100f;

        double BMI = weight / Math.pow(heightInMeters, 2);

        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI Optymalne");
        } else {
            System.out.println("BMI Nieoptymalne");
        }


        //ROZWIĄZANIE OBIEKTOWE
        Bmi bmi = new Bmi(80, 190);
        bmi.calculateBmi();
    }
}
