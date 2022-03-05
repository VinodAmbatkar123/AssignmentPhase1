package que12;





import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {78,40,19,25,11,10,22,14};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int searchValue = sc.nextInt();
        
        int result = linearing(arr,searchValue);
        if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
            }
        }

public static int linearing(int arr[], int x) {

    int arrlength = arr.length;
    for (int i = 0; i < arrlength ; i++) {

        if (arr[i] == x) {
            return i;
         }
     }
            return -1;
   }
}



