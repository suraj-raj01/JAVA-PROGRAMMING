/*
Design the application using the following specification
Create a class design.one.UserName, which contains two fields first name and last name of type String. design.one.UserName class must be properly encapsulated. This class will contain a method fullName, which will return full name by combining first name and last name. This class doesn't have any constructor.

Sample
first name = Ramesh, last name = Sharma, then full name is Ramesh Sharma

Create a utility class design.one.MyUtility. This class will have one static method countVowel, which accept one parameter of type design.one.UserName and return the count of vowels in the parameter. This class also contains a private method isVowel, that will accept one parameter of type char and return true if the parameter is a vowel, otherwise it will return false. This class doesn't have any constructor.
Create a class design.one.MyMain, which contains a main method. And perform the following tasks :

From main method accept first name and last name from the user and store it in design.one.UserName object.
Print the full name of the user
Print the number of vowels in the full name of the user, using the countVowel method.


*/
package design.specification1;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserName userName = new UserName();
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        userName.setFirstName(firstName);
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        userName.setLastName(lastName);
        System.out.println("FullName = " + userName.fullName());
        System.out.println("Vowels in [ "+userName.fullName()+" ] : "+MyUtility.countVowel(userName));
    }
}
