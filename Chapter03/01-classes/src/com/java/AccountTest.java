package com.java;

public class AccountTest {
    public static void main(String[] args) {
        Account currentAccount = new Account();
        Account savingAccount = new Account();
        Account investmentAccount = new Account();

        currentAccount.number = 11;
        currentAccount.balance = 20.5;
        currentAccount.client.name = "Leandro Jorge";
        currentAccount.client.age = 36;

        savingAccount.number = 51;
        savingAccount.balance = 4500;
        savingAccount.client.name = "Fulano Silva";
        savingAccount.client.age = 40;

        investmentAccount.number = 21;
        investmentAccount.balance = 500;
        investmentAccount.client.name = "Ciclano Pereira";
        investmentAccount.client.age = 25;

        System.out.println(currentAccount.number);
        System.out.println(currentAccount.balance);
        System.out.println(currentAccount.client.name);
        System.out.println(currentAccount.client.age);
    }
}
