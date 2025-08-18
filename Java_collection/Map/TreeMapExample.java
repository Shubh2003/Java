import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,String> capital = new TreeMap<>();
        capital.put("India","mumbai");
        capital.put("Australia","sydney");

        System.out.println(capital);

        // Print keys
        for (String i : capital.keySet()) {
        System.out.println(i);
        }

        // Print values
        for (String i : capital.values()) {
        System.out.println(i);
        }
        //common methods

        //.get()
        //.remove()
        //.clear()
        //.size()
    }
}
