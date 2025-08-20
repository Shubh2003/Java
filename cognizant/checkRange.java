public class checkRange {
    public static boolean checkrange(int[] arr,int A,int B){
        for (int i = A;i<=B;i++){
            boolean found = false;
           for(int j = 0;j<arr.length;j++){
            if(arr[j] == i){
                found = true;
                break;
            }
           }
           if(!found) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,7,8,3};
        int A = 2;
        int B = 5;
        if(checkrange(arr,A,B)){    
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}
