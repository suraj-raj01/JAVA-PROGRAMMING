package logicalprogram.arrays;

import java.util.Scanner;

// Check wether the two given arrays are same.
public class Main {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,5};

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
        boolean flag = false;
        if(arr1.length==arr2.length)
        {
            for(int i=0; i<arr1.length; i++){
                if(arr1[i]==arr2[i]){
                    flag = true;
                }
            }
        }
        else{
            System.out.println("not possible");
        }
        System.out.println(flag);
    }
}
