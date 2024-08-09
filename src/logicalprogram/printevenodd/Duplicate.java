package logicalprogram.printevenodd;
import java.util.Scanner;
/*
Write a program to find duplicate digits in the given string number.
*/
public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string (number) : ");
        String data = scanner.next();
        int[] arr = new int[data.length()];
        for(int i=0; i<data.length(); i++){
            char character = data.charAt(i);
            int res = Integer.parseInt(character+"");
            arr[i] = res;
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
