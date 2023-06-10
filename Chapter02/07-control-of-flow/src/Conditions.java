public class Conditions {
    public static void main(String[] args) throws Exception {
        byte age = 101;

        if(age < 0) System.out.println("Invalid age");
        else if(age >= 100) System.out.println("Centenary");
        else if(age < 100 && age >= 70) System.out.println("Third age");
        if(age >= 18 && age < 70) System.out.println("Legal age");
        else if(age < 18) System.out.println("Underage");
    }
}
