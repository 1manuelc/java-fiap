package com.java;

public class Program {
    public static void main(String[] args) {
        Account cc = new Account();           // isn't
        //Account cc = new CurrentAccount();    // is
        // CurrentAccount cc = new Account();    // error
        if(cc instanceof CurrentAccount)
            System.out.println("cc type is Account");
        else
            System.out.println("cc type isn't Account");
    }
}
