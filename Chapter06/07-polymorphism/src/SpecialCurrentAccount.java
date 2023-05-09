public class SpecialCurrentAccount extends CurrentAccount {
    private double limit;

    public SpecialCurrentAccount() {}
    public SpecialCurrentAccount(double balance, double limit) {
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public void withdraw(double value) throws OutOfBalanceException {
        if(value > balance + limit)
            throw new OutOfBalanceException();
        balance = balance - value;
    }
}
