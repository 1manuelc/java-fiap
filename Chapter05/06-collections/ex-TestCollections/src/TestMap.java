import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> cashier = new HashMap<String, String>();
        cashier.put("M2225", "Fernando");
        cashier.put("M2226", "Maria");
        cashier.put("M2227", "Soraya");

        System.out.println(cashier.isEmpty());
        // => false
        System.out.println(cashier.size());
        // => 3
        System.out.println(cashier.containsKey("M2225"));
        // => true
        System.out.println(cashier.containsValue("Fernando"));
        // => true
        System.out.println(cashier);
        // => {M2225=Fernando, M2226=Maria, M2227=Soraya}

        /* Main Methods of the Map Interface
            clear -> remove all maps
            containsKey -> search by key
            containsValue -> search by value
            get -> return a value by a key
            isEmpty -> is the map empty?
            keySet -> return a set containing the keys
            put -> add a map
            remove -> remove a map
            size -> return number of maps
            values -> return number of values
        */
    }
}
