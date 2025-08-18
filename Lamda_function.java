import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamda_function {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(25);
        array.add(5);
        array.add(7);

        Consumer<Integer> method = (shubham) -> {System.out.println(shubham);};
            array.forEach(method);
    }
    
}
