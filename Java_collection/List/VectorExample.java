import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Kela");

        for(String fruit : vector){
            System.out.println(fruit);
        }    

        Iterator<String> iterator = vector.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    } 
}
