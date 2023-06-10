package com.java;

public class Account {
    int number;
    double balance;

    Client client = new Client();

    public double getBalance() {
        return balance;
    }
    public void deposit(double value) {
        balance += value;
    }
    public void deposit(double value, double tax) {
        balance += value - tax;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public Account() {}
    public Account(int number, double balance, String nome, byte age) {
        this.number = number;
        this.balance = balance;
        this.client.name = nome;
        this.client.age = age;
    }
}
