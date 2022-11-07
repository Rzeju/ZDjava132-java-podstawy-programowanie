package zad1;

//Klasa Circle (reprezentuje koło - obiekty tej klasy to koła o średnicy przekazanej w konstruktorze)
public class Circle {

    //Średnica koła (pole klasy)
    //To pole jest 'finalne' - raz zainicjalizowane nie może zmienić wartości
    private final float diameter;

    //Konstruktor z parametrem
    //Przekazana w nim wartość zostanie przypisana do pola diameter każdego z utworoznych obiektów
    public Circle(float diameter) {
        this.diameter = diameter;
    }

    //Metoda obliczająca obwód koła na podstawie jego średnicy (pole diameter)
    public double calculatePerimeter() {
        return diameter * Math.PI;
    }
}
