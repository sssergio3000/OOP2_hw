package car_task2;

public class Car {
    int year;
    String color;

    public Car(){

    }
    public Car(int year){
    this.year = year;
    this.color = "white";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
