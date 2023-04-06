import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<String>();
        // Implement a ArrayList in a List interface allowing
        // only strings in the data structure

        System.out.println(cart.isEmpty());
        // -> return boolean => true

        cart.add("Apple");
        cart.add("Strawberry");
        cart.add("Apple");
        cart.add("Peach");

        System.out.println(cart.isEmpty());
        // => false
        System.out.println(cart.size());
        // -> return the amount of indexes filled => 4
    }
}
