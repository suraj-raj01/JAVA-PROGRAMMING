package design.specification3;
public class RectangleShape {
    private double length;
    private double width;

    public  RectangleShape(){

    }

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

//        RectangleShape object1 = new RectangleShape();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length : ");
//        double length = scanner.nextDouble();
//        object1.setLength(length);
//        System.out.println("Enter the width: ");
//        double width = scanner.nextDouble();
//        object1.setWidth(width);
//        MyMain obj = new MyMain();
//        System.out.println("For object1:");
//        System.out.println("Perimeter of rectangle: ");
//        System.out.println(obj.calculatePerimeter(object1));
//        System.out.println("Area of rectangle: ");
//        System.out.println(obj.calculateArea(object1));
//
//        RectangleShape object2 = new RectangleShape();
//        System.out.println("Enter the length : ");
//        length = scanner.nextDouble();
//        object2.setLength(length);
//        System.out.println("Enter the width: ");
//        width = scanner.nextDouble();
//        object2.setWidth(width);
//        obj = new MyMain();
//        System.out.println("For object2:");
//        System.out.println("Perimeter of rectangle: ");
//        System.out.println(obj.calculatePerimeter(object2));
//        System.out.println("Area of rectangle: ");
//        System.out.println(obj.calculateArea(object2));
//
//        RectangleShape object3 = new RectangleShape();
//        System.out.println("Enter the length : ");
//        length = scanner.nextDouble();
//        object3.setLength(length);
//        System.out.println("Enter the width: ");
//        width = scanner.nextDouble();
//        object3.setWidth(width);
//        obj = new MyMain();
//        System.out.println("For object3:");
//        System.out.println("Perimeter of rectangle: ");
//        System.out.println(obj.calculatePerimeter(object3));
//        System.out.println("Area of rectangle: ");
//        System.out.println(obj.calculateArea(object3));