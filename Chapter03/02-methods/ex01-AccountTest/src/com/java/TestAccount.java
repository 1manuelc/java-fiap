package com.java;

public class TestAccount extends Account {
    public static void main(String[] args) {
        Account currentAcc = new Account(11, 20.5, "Leandro Jorge",(byte)36);
        Account savingAcc = new Account(51, 4500, "Fulano Silva", (byte)40);
        Account investmentAcc = new Account(21, 500, "Ciclano Pereira", (byte)25);

        System.out.println("Actual balance: " + currentAcc.balance);

        currentAcc.deposit(200, 100);
        savingAcc.deposit(100, 10);
        investmentAcc.deposit(200);

        System.out.println("Actual balance: " + currentAcc.balance);
    }
}
