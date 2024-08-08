/*
Design a class name Card which contains following fields Make,Modal,Year and Color create one method display info whenever called will return a String containing make,model,year and color as comma separated value This class will contain a parameterized Constructor.
*/
package design.Specification4;
public class Car {
    private String make;
    private String modal;
    private String color;
    private int year;

    public Car(String make, String modal, String color, int year) {
        this.make = make;
        this.modal = modal;
        this.color = color;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String displayInfo()
    {
        return "Make - "+make+", Model "+modal+", Year - "+year+", Color - "+color;
    }
}
