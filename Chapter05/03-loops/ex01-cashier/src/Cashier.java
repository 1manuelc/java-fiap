public class Cashier {
    public static void main(String[] args) {
        int productsQtt = 5;
        int register = 0;

        // While verify the condition before the loop starts.
            while(register < productsQtt) {
                register++;
                System.out.println("Product number " + register + " has been registered");
            }

        // Do-while run the code block first, and at the end
        // of the first loop verify the condition.
            do {
                register++;
                System.out.println("Product number " + register + " has been registered");
            } while(register < productsQtt);

        // ! While and Do-While are mostly used when we don't
        // know how many interactions will run

        // For verify the loop interaction using an auxiliary
        // variable, a condition and his increment till the
        // condition be satisfied.
            for(int i = 1; i <= productsQtt; i++) {
                register++;
                System.out.println("Product number " + register + " has been registered");
            }
    }
}