public class largestElement {

    static int maxElement(int []arr){
        int size = arr.length;
        int max = arr[0];

        for(int i = 1;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

     static int secondMax(int []arr){
        int size = arr.length;
        int max = -1;
        int secondMax = -1;

        for(int i = 1;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0;i<size;i++){
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int [] arr = {34,656,234,64364,2,424,243};
        int max = secondMax(arr);
        System.out.println(max);
    }
}
