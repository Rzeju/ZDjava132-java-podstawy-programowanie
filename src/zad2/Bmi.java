package zad2;

public class Bmi {

    //kg
    private float weight;
    //m
    private float height;

    public Bmi(float weightInKilograms, int heightInCentimeters) {
        this.weight = weightInKilograms;
        this.height = heightInCentimeters / 100f;
    }

    public void calculateBmi() {
        double BMI = weight / Math.pow(height, 2);

        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI Optymalne");
        } else {
            System.out.println("BMI Nieoptymalne");
        }
    }
}
