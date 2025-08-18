public class reverseArray {

    // public static void reverseArray(int[] arr,int d){
    //     for (int i = 0 ;i<(d/2);i++){
    //         int temp = arr[i]; 
    //         arr[i] = arr[ d- i- 1];
    //         arr[d-i-1] = temp;
    //     }
    // }

    public static void reverse(int[] arr,int d){
        int start = 0;
        int end = d-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] array,int d){
        for(int i = 0;i<d;i++){
            System.out.print(array[i] + " " );
        }
    }
  public static void main(String[] args) {
    int [] arr = {1,2,4,5,6,7};
    int d = 6;
    reverse(arr,d);
    printArray(arr,d);
  }  
}



//  1 2 4 5 6 7
//  0 1 2 3 4 5