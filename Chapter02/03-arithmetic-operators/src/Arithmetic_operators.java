public class Arithmetic_operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        int result = x + y;
        System.out.println("Sum: " + result);

        result = x - y;
        System.out.println("Subtraction: " + result);

        result = x * y;
        System.out.println("Product: " + result);

        result = x / y;
        System.out.println("Division: " + result);

        result = x % y;
        System.out.println("Rest: " + result);

        result = z - x + y * (x / y);
        System.out.println("Operation: " + result);
    }
}
