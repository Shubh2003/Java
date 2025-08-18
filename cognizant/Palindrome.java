// public class Palindrome {

//     static boolean palindrome(int n){
//         String element = Integer.toString(n);
//         int len = element.length();
//         for(int i = 0;i<len/2;i++){
//             if(element.charAt(i) != element.charAt(len - i - 1)){
//                 return false;
//             }
          
//         }
//           return true;
//     }

//     public static boolean checkPalindrome(int [] arr){
//         for(int i = 0;i<arr.length;i++){
//             if(!palindrome(arr[i])){
//                 return false;
//             }
           
//         }
//          return true;
//     }
//     public static void main(String[] args) {
//         int [] arr = {111,222,333,76};

//        boolean ans = checkPalindrome(arr);
//        System.out.println(ans);

//     }    
// }

class Palindrome{
public static void main(String[] args) {
    int [] arr = {12,3,34,4,2,42,324,2,5,8};
    int t = 12;

    for(int i = 0;i<arr.length;i++){
        if(arr[i] == t){
            System.out.println(i);
        }
    }

}
}