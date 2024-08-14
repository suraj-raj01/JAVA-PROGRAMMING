package logicalprogram.arrays;

import java.util.Scanner;

// Check wether the two given arrays are same.
public class IsSameArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Enter the array size: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for(int i=0; i<arr2.length; i++)
        {
            arr2[i]=scanner.nextInt();
        }
        int count=0;
        boolean flag = true;
        if(arr1.length==arr2.length)
        {
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]!=arr2[i]){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Arrays are same!!");
            }
            else{
                System.out.println("Arrays are not same!!!");
            }
        }
        else{
            System.out.println("Both arrays has different size!!");
        }

    }
}
