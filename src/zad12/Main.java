package zad12;

public class Main {

    public static void main(String[] args) {

        String text = " 123  570 ";

        String[] signs = text.split("");

        int spaces= 0;
        for(int i= 0; i < signs.length; i++){
            if (signs[i].equals(" ")) {
                spaces++;
            }
        }

        float result = 100f * spaces / text.length();

        System.out.printf("Spacje stanowią %.2f%% tekstu", result);
    }
}
