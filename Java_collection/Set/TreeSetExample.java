import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("nano");
        System.out.println(cars); // automatically sorts all the elements 
        // OTHER METHODS 
        // .remove
        // .clear
        // .size
    }    
}
