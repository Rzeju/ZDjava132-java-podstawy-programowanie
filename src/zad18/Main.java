package zad18;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Regex dla 'aaaaa psik'
        //Przez naszym wrażeniem może być początek lini lub jedna spacja
        //Potem dowlna liczba a, jedna spacja oraz psik
        //na konću jednak spacja lub zakończenie linii
        Pattern pattern = Pattern.compile("(^|\\s)a+\\spsik($|\\s)");
        //String do testu
        String myString = "aaaaaaaaaaa psik";

        //używany tutaj metody find z Matchera
        //chcemy zobaczyć czy w tekście występuje nasz regex a nie czy cały tekst go spełnia
        boolean result = pattern.matcher(myString).find();
        //wydruk informacji w zależności od wyniku
        if (result) {
            System.out.println("User kichnął");
        } else {
            System.out.println("User nie kichnął");
        }
    }
}
