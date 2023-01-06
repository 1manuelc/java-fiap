public class oplogOR {
    public static void main(String[] args) {
        int nAmarelo = 1, nVermelho = 0;
        boolean suspenso = nAmarelo == 2 || nVermelho == 1;
        // operador or = ||
        
        if(suspenso == true)
            System.out.println("Jogador suspenso");
        else
            System.out.println("Jogador nao suspenso");
    }
}
    
