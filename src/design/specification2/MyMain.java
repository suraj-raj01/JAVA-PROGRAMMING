package design.specification2;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address permanent = new Address();
        System.out.println("Enter the flat number: ");
        int flatNumber = scanner.nextInt();
        scanner.nextLine();
        permanent.setFlatNumber(flatNumber);
        System.out.println("Enter the Building Name: ");
        String buildingName = scanner.nextLine();
        System.out.println("Enter the locality: ");
        String locality = scanner.nextLine();
        System.out.println("Enter the city: ");
        String city = scanner.nextLine();
        System.out.println("Enter the district: ");
        String district = scanner.nextLine();
        System.out.println("Enter the state: ");
        String state = scanner.nextLine();
        System.out.println("Enter the country: ");
        String country = scanner.nextLine();
        System.out.println("Enter the pin code: ");
        int pinCode = scanner.nextInt();
        permanent.setBuildingName(buildingName);
        permanent.setLocality(locality);
        permanent.setCity(city);
        permanent.setDistrict(district);
        permanent.setState(state);
        permanent.setCountry(country);
        permanent.setPincode(pinCode);
        System.out.println(permanent.fullAddress());

        if(MyUtility.isValidAddress(permanent)){
            System.out.println("Valid Address");
        }
    }
}
