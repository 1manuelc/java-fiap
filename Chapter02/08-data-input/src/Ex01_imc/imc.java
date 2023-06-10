package Ex01_imc;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Type your weight: ");
        float weight = scan.nextFloat();

        System.out.println("Type your height: ");
        float height = scan.nextFloat();
        scan.close();

        float imc = weight / (height * height);

        if(imc >= 18.5 && imc <= 25.0) System.out.println("IMC = " + imc + " -> Ideal weight");
        else System.out.println("IMC = " + imc + " -> Out of ideal weight");
    }
}
