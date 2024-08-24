package design.Specification4;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Make of the car : ");
        String make = scanner.nextLine();
        System.out.println("Enter the Model : ");
        String modal = scanner.nextLine();
        System.out.println("Enter the Manufacture year, YYYY - ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Color : ");
        String color = scanner.nextLine();
        Car car = new Car(make,modal,color,year);
        System.out.println(car.displayInfo());
        Car car1 = new Car("Volvo","Suzuki","Black-white",2004);
        System.out.println(car1.displayInfo());
        System.out.println(car1.equals(car));
        car1.setColor("RED");
        car1.setMake("Mahindra");
        car1.setModal("Scorpio");
        car1.setYear(2005);
        car1.setColor("Black");
        System.out.println(car1.displayInfo());
    }
}
