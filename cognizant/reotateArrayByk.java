import java.util.*;

public class reotateArrayByk {

    static void reverse(int[] arr,int start,int end){
      while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    public static void reverseArraybyk(int [] arr,int d,int n){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void printArray(int[] array,int d){
        for(int i = 0;i<d;i++){
            System.out.print(array[i] + " " );
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int d = 2;
        int n = 6;
        reverseArraybyk(arr,d,n);
        printArray(arr,n);
    }
}
