package com.java;

// Type cast in inheritance exercise

public class TestAccount extends Account {
    public static void main(String[] args) {
        Account dad = new Account(1001, 49, 7500);
        CurrentAccount mom = new CurrentAccount();
        mom.setInfo(1001, 51);
        mom.addBalance(5000);

        dad.removeBalance(500);
        mom.removeBalance(500);

        System.out.println(dad.getBalance()); // 7500 - 500 = 7000
        System.out.println(mom.getBalance()); // 5000 - 500 - 10(tax of the override function) = 4490
    }
}
