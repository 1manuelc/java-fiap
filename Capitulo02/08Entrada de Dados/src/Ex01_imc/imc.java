package Ex01_imc;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
            System.out.println("Digite seu peso: ");
            float peso = scan.nextFloat();

            System.out.println("Digite sua altura: ");
            float altura = scan.nextFloat();
        scan.close();

        float imc = peso / (altura * altura);
        if(imc >= 18.5 && imc <= 25.0)
            System.out.println("IMC = " + imc + " -> Peso ideal");
        else
            System.out.println("IMC = " + imc + " -> Peso fora do normal");
    }
}
