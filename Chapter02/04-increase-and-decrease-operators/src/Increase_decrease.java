public class Increase_decrease {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 20, c = 30;

        // In attributions on the same variable, there's no problem putting the operators before or after
        --a;
        ++a;
        System.out.println("a = " + a);

        b++;
        b--;
        System.out.println("b = "+ b);
        System.out.println("c = " + c);

        // In attributions to other variables, pay attention to the order of operator and variable
        // If the operator goes first, the result goes to both variables used.
            // c = ++a; -> c == a;

        // If the operator comes after the variable, the result will be attributed only for the inner variable.
            // c = a--; -> c == a, a == --a;
        
        c = a--;
        System.out.println("\n\tc = a--\nc = " + c + "\na = " + a);
        a++;

        c = ++a;
        System.out.println("\n\tc = ++a\nc = " + c + "\na = " + a);
    }
}
