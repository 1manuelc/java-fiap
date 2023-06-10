public class Xor {
    public static void main(String[] args) {
        // XOR, exclusive OR = ^
        // It's true only when one side of the comparison is true
        // False when both sides are true
            /*
             * T    ^    T = F
             * F    ^    F = F
             * F    ^    T = T
             * T    ^    F = T
             */
        
            byte x = 11, y = 11;
            boolean test = x > 10 ^ y > 10;
            System.out.println(test);
    }
}
