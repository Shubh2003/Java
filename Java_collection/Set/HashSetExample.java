//common set methods
// add()	  --> Adds an element if it's not already in the set
// remove()	  --> Removes the element from the set
// contains() --> Checks if the set contains the element
// size()	  --> Returns the number of elements
// clear()	  --> Removes all elements

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Audi");

        System.out.println(cars);
    }    
}
