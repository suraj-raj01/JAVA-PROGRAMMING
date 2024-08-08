package design.specification3;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for object1");
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        RectangleShape object1 = new RectangleShape(length,width);
        System.out.println("Perimeter : "+myMain.calculatePerimeter(object1));
        System.out.println("Area : "+myMain.calculateArea(object1));

        System.out.println("Enter value for object2");
        System.out.print("Enter the length: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        RectangleShape object2 = new RectangleShape(length,width);
        System.out.println("Perimeter : "+myMain.calculatePerimeter(object2));
        System.out.println("Area : "+myMain.calculateArea(object2));

        System.out.println("Enter value for object3");
        System.out.print("Enter the length: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        RectangleShape object3 = new RectangleShape(length,width);
        System.out.println("Perimeter : "+myMain.calculatePerimeter(object3));
        System.out.println("Area : "+myMain.calculateArea(object3));

        System.out.println(myMain.isSameRectangle(object1,object2));
        System.out.println(myMain.isSameRectangle(object2,object3));
    }
    public double calculatePerimeter(RectangleShape object){
        double length = object.getLength();
        double width = object.getWidth();
        return  (length+width)*2;
    }
    public double calculateArea(RectangleShape object){
        double length = object.getLength();
        double width = object.getWidth();
        return length*width;
    }
    public boolean isSameRectangle(RectangleShape rectangleShape1, RectangleShape rectangleShape2){
        boolean response = false;
        if(rectangleShape1.equals(rectangleShape2)){
            response = true;
        } else if (rectangleShape1.getLength() == rectangleShape2.getLength()
                    && rectangleShape1.getWidth() == rectangleShape2.getWidth()) {
            response = true;
        }
        return response;
    }
}
