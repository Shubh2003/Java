//COMMON LIST METHODS
// add()    ---> Adds an element to the end of the List
// get()    ---> Returns the element at the specified position
// set()    ---> Replaces the element at the specified position
// remove() ---> Remove the element at the specified position
// size()   ---> Returns the number of element in the list  
// clear()  ---> used to remove all the element in the ArrayList 


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListE{
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Shubham");
        arrayList.add("Prathamesh");
        

        for(String fruit : arrayList){
            System.out.println(fruit);
        }


        System.out.println("Printing using iterator");

        Iterator<String> it =  arrayList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
       
    }
}
