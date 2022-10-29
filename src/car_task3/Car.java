package car_task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;
    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public Car(int year, String color, int weight, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
