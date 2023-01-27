package com.java;

public class Account {
    private int agency;
    private int number;
    private double balance;

    public Account() {
    }

    public Account(int agency, int number, double balance) {
        this.agency = agency;
        this.number = number;
        this.balance = balance;
    }

    public void addBalance(double value) {this.balance += value;}

    public void removeBalance(double value) {this.balance -= value;}

    public double getBalance() {return this.balance;}

    public void getInfo() {
        System.out.println("Account information:");
        System.out.println("Number: " + this.number);
        System.out.println("Agency: " + this.agency);
    }

    public void setInfo(int agency, int number) {
        this.agency = agency;
        this.number = number;
    }
}
