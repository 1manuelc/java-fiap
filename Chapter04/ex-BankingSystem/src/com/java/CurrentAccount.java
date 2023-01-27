package com.java;

public class CurrentAccount extends Account { // Extends features of Account superclass
    private String type;
    private double specialCheckBalance;

    public CurrentAccount() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpecialCheckBalance() {
        return specialCheckBalance;
    }

    public void setSpecialCheckBalance(double specialCheckBalance) {
        this.specialCheckBalance = specialCheckBalance;
    }

    public double getBalanceAvailable() {
        return super.getBalance() + this.specialCheckBalance; // Uses super."feature" to use the current
                                                              // superclass features into this subclass
    }

    @Override
    public void removeBalance(double value) { // We'll admit that the tax for remove balance is 10
        value += 10;                          // and overwrite the superclass identical function
        super.removeBalance(value);
    }

    public void setAttributes(int agency, int number) {
        super.setInfo(agency, number);
    }
}
