package logicalprogram.printevenodd;
import java.util.Scanner;
/*
Write a program to print odd element present at even index of an integer array.
*/
public class PrintOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" element: ");
        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<size; i+=2){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
