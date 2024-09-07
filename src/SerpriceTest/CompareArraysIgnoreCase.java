package SerpriceTest;

public class CompareArraysIgnoreCase {
    public static boolean compareArraysIgnoreCase(char[] array1, char[] array2){
        boolean response = array1.length == array2.length;
        for(int i=0; i<array1.length; i++){
//            for(int j=0; j<array2.length; j++){
                if(Character.toLowerCase(array1[i])!=Character.toLowerCase(array2[i])){
                    response = false;
                }
//            }
        }
        return response;
    }

    public static void main(String[] args) {
        char[] arr1 = {'a','b','c','d'};
        char[] arr2 = {'A','B','r','D'};
        System.out.println(compareArraysIgnoreCase(arr1,arr2));
    }
}
