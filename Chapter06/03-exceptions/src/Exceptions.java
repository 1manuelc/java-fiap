public class Exceptions {
    public static void main(String[] args) {
        try {
            int val = 10 / 0;       // division by zero is invalid
            System.out.println(val);
    
        } catch (Exception e) {     // capture the exception,
            e.printStackTrace();    // treats the exception,
                                    // prints it.
        }
    }
}
