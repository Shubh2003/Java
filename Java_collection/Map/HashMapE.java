import java.util.HashMap;


public class HashMapE {
    public static void main(String[] args) {
        //HashMap   --> fast and unordered
        //TreeMap   --> sorted by key
        //LinkedHashMap -> ordered by insertion
HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");

    System.out.println(capitalCities); 



    //COMMON METHODS 
    //.get()
    //.remove()
    //.size()
    }
}
