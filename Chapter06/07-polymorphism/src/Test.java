public class Test {
    public static void main(String[] args) {
        CurrentAccount acc = new SpecialCurrentAccount(50, 75);

        try {
            acc.withdraw(200);
        } catch (OutOfBalanceException e){
            e.printStackTrace();
        }
    }
}
