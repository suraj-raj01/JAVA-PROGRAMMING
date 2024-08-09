package logicalprogram.checkprime;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long number = scanner.nextLong();
        CheckPrime checkPrime = new CheckPrime();
    }
}
