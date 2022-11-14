package zad13;

public class Main {

    public static void main(String[] args) {

        String text = "Ala ma     kota";

        String[] somethingToSay = text.split(" ");

        for (int i = 0; i < somethingToSay.length; i++) {
            System.out.printf("%s %s ", somethingToSay[i].trim(), somethingToSay[i].trim());
        }
    }
}
