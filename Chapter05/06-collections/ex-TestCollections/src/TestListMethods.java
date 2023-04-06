import java.util.ArrayList;
import java.util.List;

public class TestListMethods {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<String>();
        cart.add("Apple");
        cart.add("Strawberry");
        cart.add("Apple");

        System.out.println(cart.contains("Apple"));
        // return boolean => true
        System.out.println(cart.indexOf("Apple"));
        // return first index of parameter => 0
        System.out.println(cart.get(cart.indexOf("Apple")));
        // return the index of the parameter and show what's
        // inside the list in that index
        System.out.println(cart.lastIndexOf("Apple"));
        // return the last index of the parameter => 2

        cart.remove(cart.indexOf("Apple"));
        // remove by the index
        System.out.println(cart.get(0));
        // => Strawberry

        cart.clear();
        // clear all the list
        System.out.println(cart.isEmpty());
        // => true
    }
}
