import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> basket = new HashSet<String>();
        // instantiate a HashSet using a Set interface

        System.out.println(basket.isEmpty());
        // => true

        basket.add("Apple");
        basket.add("Apple");
        basket.add("apple");

        System.out.println(basket.isEmpty());
        // => false

        System.out.println(basket.size());
        // => 2
        System.out.println(basket);
        // => [Apple, apple]
        // -> HashSet don't allow duplicated items
    }
}
