public class operadores_aritmeticos {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;

        int result = x + y;
        System.out.println("Soma: " + result);

        result = x - y;
        System.out.println("Subtracao: " + result);

        result = x * y;
        System.out.println("Produto: " + result);

        result = x / y;
        System.out.println("Divisao: " + result);

        result = x % y;
        System.out.println("Resto: " + result);

        result = z - x + y * (x / y);
        System.out.println("Operacoes: " + result);
    }
}
