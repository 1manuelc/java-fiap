import java.util.ArrayList;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList cart = new ArrayList();
        double value = 100.55;
        int value2 = 1;
        int value3;

        cart.add(value);
        cart.add("Grape");
        cart.add(value2);

        System.out.println(cart.get(1));
        // -> return the item in index 1 => Grape

        // value3 = cart.get(2); // only work with cast because
        // of generics
        value3 = (int)cart.get(2);
        System.out.println(value3);

        /* Main Methods Inherited of the Collection Interface:
            add -> add an object in the set
            clear -> clear all objects in the set
            contains -> verify if the object contains a determined object
            isEmpty -> is the set empty?
            remove -> remove a specific object in the set
            size -> return the quantity of objects in the set
            toArray -> return an array containing the objects in the set
        */
    }
}