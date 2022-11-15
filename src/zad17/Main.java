package zad17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInputDate = scanner.nextLine();

        LocalDate courseDate = LocalDate.parse(userInputDate);
        LocalDate today = LocalDate.now();

        Period periodResult = Period.between(courseDate, today);

        long chronoUnitResult = ChronoUnit.DAYS.between(courseDate, today);


        System.out.println("Period Lata: " + periodResult.getYears());
        System.out.println("Period Miesiące: " + periodResult.getMonths());
        System.out.println("Period Dni: " +periodResult.getDays());

        System.out.println("Liczba dni pomiędzy wynosi: " + chronoUnitResult);
    }
}
