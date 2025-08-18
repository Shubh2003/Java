import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Apple");
        st.push("Kela");
        
        for(String fruit : st){
            System.out.println(fruit);
        }

        Iterator<String> iterator = st.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }    
    }
}
