//LINKEDLIST METHODS
//addFirst() -> Adds an element to the beginning of the list
//addLast()	 -> Add an element to the end of the list
// removeFirst() ->	Remove an element from the beginning of the list	
// removeLast()  ->	Remove an element from the end of the list	
// getFirst()    ->	Get the element at the beginning of the list	
// getLast()	  -> Get the element at the end of the list

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> LL = new LinkedList<>();

        LL.add("Apple");
        LL.add("Banana");
        LL.add("Watermelon");


        for (String fruit : LL){
            System.out.println(fruit);
        }


        System.out.println("Printing using iterator");
        Iterator<String> iterator = LL.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }    
}
