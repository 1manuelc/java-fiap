import java.util.Scanner;
// importa-se a classe scanner para scanear entradas do usuario

public class Input {
    public static void main(String[] args) {
        byte age = 0;
        String name;
        
        // creating a variable scanner of class Scanner //
        // instantiate passing to the constructor the default input System.in, the keyboard
        Scanner scanner = new Scanner(System.in); // abre-se o scanner

        // How to request data?
        // scanner.next -> receives the next word typed until the next spacebar
        // scanner.nextLine -> receives the whole line typed

        // scanner.nextInt();
        // scanner.nextByte(); and there it goes...

        System.out.println("Type your name: ");
        name = scanner.nextLine();

        System.out.println("Type your age: ");
        age = scanner.nextByte();
        scanner.close(); // closes the scanner

        System.out.println("Name: " + name);
        if(age < 0) System.out.println("Invalid age");
        else if(age >= 100) System.out.println("Centenary");
        else if(age < 100 && age >= 70) System.out.println("Third age");
        if(age >= 18 && age < 70) System.out.println("Legal age");
        else if(age < 18) System.out.println("Underage");
    }
}
