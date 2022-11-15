package zad18;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(^|\\s)a+\\spsik($|\\s)");
        String myString = "aaaaaaaaaaa psik";

        boolean result = pattern.matcher(myString).find();
        if (result) {
            System.out.println("User kichnął");
        } else {
            System.out.println("User nie kichnął");
        }
    }
}
