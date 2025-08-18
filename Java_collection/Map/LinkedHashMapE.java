import java.util.LinkedHashMap;

public class LinkedHashMapE {
    public static void main(String[] args) {
    LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities);

    // Print keys
    for (String key : capitalCities.keySet()) {
    System.out.println(key);
    }

    // Print values
    for (String value : capitalCities.values()) {
    System.out.println(value);
    }
        //commmon methods

    //.remove()
    //.clear()
    //.size()
    }    
}
