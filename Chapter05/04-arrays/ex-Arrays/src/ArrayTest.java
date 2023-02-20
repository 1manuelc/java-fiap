public class ArrayTest {
    public static void main(String[] args) {
        Product products[] = new Product[2];

        Product prod1 = new Product();
        prod1.setName("Lemon");
        prod1.setDescription("Limmy");
        prod1.setValue((float)4.5);

        Product prod2 = new Product();
        prod2.setName("Apple");
        prod2.setDescription("Juicy");
        prod2.setValue((float)5);

        products[0] = prod1;
        products[1] = prod2;

        /*
        for(int i = 0; i < products.length; i++)
            System.out.println(products[i].toString());
         */

        for(Product prod: products)
            System.out.println(prod.toString());
    }
}
