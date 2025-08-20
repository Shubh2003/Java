import javax.sound.sampled.BooleanControl;

public class StringE {
    // REVERSE STRING
    // public static void main(String[] args) {
    //     String str = "Shubham";
    //     String ans = "";

    //     for(int i = str.length()-1;i>=0;i--){
    //         ans += str.charAt(i);
    //     }
    //     System.out.println(ans);

    // FIRST NON REPEATING CHARACTER
    // public static char checkRepeated(String word){
    //     int len = word.length();
        
    //     for(int i = 0;i<len;i++){
    //         Boolean flag = false;
    //         for(int j = i + 1;j<len;j++){
    //             if(word.charAt(i) == word.charAt(j)){
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if(!flag){
    //             return word.charAt(i);
    //         }
    //     }
    //     return '$';

    //     int [] visited = new int[MAX_CHAR];
    //     Arrays.fill(visited,-1);

    //     for(int i = 0;i<word.length();i++){
    //         int index = word.charAt(i) - 'a';
    //         if(visited[index] == -1){
    //             visited [index] = i;
    //         }
    //         else{
    //              visited [index] = -2;
    //         }
    //     }
    // }

    public static int findSum(String word){
        String temp = "0";
        int sum = 0;

        for(int i = 0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                temp += ch;

            }
            else{
                System.out.println(temp);
                sum += Integer.parseInt(temp);
                temp = "0";
            }

        }
        return sum + Integer.parseInt(temp);
    }
    public static void main(String[] args) {
        // String word = "geeksforgeeks";
        // System.out.println(checkRepeated(word));

        String word = "1abc2x30yz67";
        System.out.println(findSum(word));
       
    }
}