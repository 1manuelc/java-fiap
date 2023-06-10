public class Or {
    public static void main(String[] args) {
        int numberOfYellowCards = 1, numberOfRedCards = 0;
        boolean suspend = numberOfYellowCards == 2 || numberOfRedCards == 1;
        // logical operator "or" = ||

        if(suspend == true) System.out.println("Player suspended from the match");
        else System.out.println("Player won't be suspended from the match");
    }
}
    
