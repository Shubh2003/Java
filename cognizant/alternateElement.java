import java.util.ArrayList;

public class alternateElement {
    static ArrayList<Integer> alternate(int []arr,int d){
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 0;i<d;i+=2){
            array.add(arr[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = arr.length;
        System.out.println(alternate(arr,d));
    }
    
}
