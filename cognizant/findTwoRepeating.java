public class findTwoRepeating {
     public static int [] findRepeating(int []arr){
        int x = -1,y=-1;
        int size = arr.length;
        for(int i = 0;i<size - 1;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i] == arr[j]){
                    if(x == -1){
                        x = arr[i];
                    }
                    else{
                        y = arr[i];
                    }
                }

            }
        }
        return new int[] { x,y };
    } 
    public static void main(String[] args) {
        int [] arr = {4,2,4,5,2,3,1};
        int d = 7;

        int [] ans = findRepeating(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
