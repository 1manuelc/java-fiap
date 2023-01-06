public class condicionais {
    public static void main(String[] args) throws Exception {
        byte idade = 101;

        if(idade < 0)
            System.out.println("Idade invalida");
        else if(idade >= 100)
            System.out.println("Centenario");
        else if(idade < 100 && idade >= 70)
            System.out.println("Terceira idade");
        if(idade >= 18 && idade < 70)
            System.out.println("Maior de idade");
        else if(idade < 18)
            System.out.println("Menor de idade");
    }
}
