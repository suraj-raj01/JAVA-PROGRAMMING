package logicalprogram.printevenodd;
import java.util.Scanner;
/*
Write a program to accept a 10-digit number from a user as a string and print All the even digits of that number
*/
public class PrintEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 10-digit number in String: ");
        String digit = scanner.next();
        for(int i=0; i<digit.length(); i++)
        {
            char digitChar = digit.charAt(i);
            int res = Integer.parseInt(digitChar+"");
            if(res%2==0)
            {
                System.out.println(res);
            }
        }
    }
}
