package myarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rad;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        rad = scan.nextDouble();
        System.out.println("Circle area is "+MyArea.areaOfCircle(rad));


    }

}
