public class oplogXOR {
    public static void main(String[] args) {
        // XOR, ou exclusivo = ^
            // É verdadeiro somente quando somente um dos lados da comparacao e verdadeiro,
            // com os dois verdadeiros o resultado e false

            /*
             * T    ^    T = F
             * F    ^    F = F
             * F    ^    T = T
             * T    ^    F = T
             */
        
            byte x = 11, y = 11;

            boolean teste = x > 10 ^ y > 10;

            System.out.println(teste);
    }
}
