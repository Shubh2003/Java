import java.util.LinkedHashSet;

public class LinkedHashedSetE {
    public static void main(String[] args) {
        //stores unique elements and remember the order they were added

        LinkedHashSet<String> lhs = new LinkedHashSet();

        lhs.add("BMW");
        lhs.add("Audi");
        lhs.add("nano");
        System.out.println(lhs);

        // OTHER METHODS 
        // .contains()
        // .remove()
        // .clear()
        // .size()
    }    
}
