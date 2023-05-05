public class Unchecked {
    public static void main(String[] args) {
        
        // Unchecked exceptions
        
        try {
            int val = 10 / 0; // Arithmetic Exception

            int values[] = new int[3];
            System.out.println(values[4]); // Array index Exception

            String name = null;
            System.out.println(name.length()); // NullPointer Exception

            int number = Integer.parseInt("zero"); // NumberFormat exception

        } catch (ArithmeticException e) {
            System.out.println("It's not possible to divide by zero");

            System.out.println(e.getMessage()); // get the exception message
            e.printStackTrace(); // prints the error stack

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It's impossible to access the position 4 in the array");

        } catch (NullPointerException e) { //...
        } catch (NumberFormatException e) { //...
        } catch (Exception e) {
            System.out.println("Program runtime error!");
            
        } finally {
            System.out.println("Always passes by here");
        }
    }
}
