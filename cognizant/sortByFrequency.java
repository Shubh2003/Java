import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortByFrequency {

    public static void sortByFreq(int [] arr){
        int n = arr.length;

        // Step1 ----> count frequency
        Map<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        
        // Step2 ----> convert key to a list
        List<Integer> list = new ArrayList<>(mp.keySet());

        // Step3 ----> sort list by frequency (descending)
        // if same frequency --> sort by value ascending

        Collections.sort(list,(a,b) -> {
            if(!mp.get(a).equals(mp.get(b))){
                return mp.get(b) - mp.get(a);
            }
            else{
                return a - b;
            }
        });
//  [4,6,2,3]

        //Step4 ---> print element according to frequency
        for(int num : list){
            int count = mp.get(num);
            for(int i = 0;i<count;i++){
                System.out.print(num + " ");
            }
        }

    }
    public static void main(String[] args) {
       int[] arr = {4, 6, 2, 4, 3, 2, 2, 6, 4, 6, 6};

         sortByFreq(arr);
    }
}