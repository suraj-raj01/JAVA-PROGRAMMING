/*
Write a program to get a string input from user, and print only the digit from that input heloo1 I will lose 3 and 4, but I have 567
*/
package logicalprogram.printevenodd;
import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String data = scanner.nextLine();
        for(int i=0; i<data.length(); i++)
        {
            if(data.charAt(i)>='0' && data.charAt(i)<'9'){
                System.out.println(data.charAt(i));
            }
        }
    }
}
