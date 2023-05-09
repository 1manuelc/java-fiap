public class CurrentAccount {
    protected double balance;

    public CurrentAccount() {}
    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value) throws OutOfBalanceException {
        if(value > balance)
            throw new OutOfBalanceException();
        balance = balance - value;

    }
}
