public class op_incrdec {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 20, c = 30;

        // Em atribuicoes na mesma variavel nao ha problema em colocar os operadores antes ou depois //
        --a;
        ++a;
        System.out.println("a = " + a);

        b++;
        b--;
        System.out.println("b = "+ b);
        System.out.println("c = " + c);

        // Em atribuicoes a outras variaveis deve-se atentar a ordem de operador e variavel
            // Se o operador vier primeiro, o resultado vai para a variavel que recebe a atribuicao e para a variavel modificada
                // c = ++a;     c == a;

            // Se o operador vier depois da variavel, o resultado vai ser modificado somente para a variavel modificada e nao para a que recebe a atribuicao
                // c = a--;     c == a, a == --a;
        
        c = a--;
        System.out.println("\n\tc = a--\nc = " + c + "\na = " + a);
        a++;

        c = ++a;
        System.out.println("\n\tc = ++a\nc = " + c + "\na = " + a);
    }
}
