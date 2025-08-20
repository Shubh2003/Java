import java.util.ArrayList;

public class elementLessOrEquals {

    public static ArrayList<Integer> lessOrEquals(int [] arr1,int [] arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.length;
        int j = arr2.length;
        for(int n = 0;n<i;n++){
            int count = 0;
            for(int m = 0;m<j;m++){
                if(arr1[n] >= arr2[m]) count++;
            }
            ans.add(count);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,7,9};
        int [] arr2 = {0,1,2,1,1,4};

     ArrayList<Integer> ans = lessOrEquals(arr1,arr2);

     for(int ans2 : ans){
        System.out.print(ans2 + " ");
     }
    }
}