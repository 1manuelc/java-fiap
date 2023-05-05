import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Propagation {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\nota.txt");
        
        PrintWriter print = new PrintWriter(fw);
        print.println("Apple = R$ 4,00");
        print.println("Strawberry = R$ 6,50");
        print.println("Total = R$ 10,50");
        print.close();
        fw.close();
    }
}
