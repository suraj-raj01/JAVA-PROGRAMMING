package logicalprogram.arrays;
// Write a program to copy first array at the end of second array, by creating third array, both the arrays can have different size.
public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {6,7,8,9,10,11,12};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0; i<arr2.length; i++){
            arr3[i]+=arr2[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[arr2.length+i]+=arr1[i];
        }
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
