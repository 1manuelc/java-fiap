import java.util.Scanner;
// importa-se a classe scanner para scanear entradas do usuario

public class entrada {
    public static void main(String[] args) {
        byte idade = 0;
        String nome;
        
                // cria-se uma variavel scanner da classe Scanner, //
                // cria-se um objeto com new e passa-se o objeto System.in para ser o construtor //

                // scanner.next -> recebe a proxima palavra a ser digitada ate o espaco
                // scanner.nextLine -> recebe a linha toda a ser digitada

                // scanner.nextInt();
                // scanner.nextByte(); e por ai vai...
            
        Scanner scanner = new Scanner(System.in); // abre-se o scanner
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            idade = scanner.nextByte();
        scanner.close(); // fecha-se o scanner

        System.out.println("Nome: " + nome);
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
