package com.java;

public class TesteConta extends Conta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(11, 20.5, "Leandro Jorge",(byte)36);
        Conta contaPoupanca = new Conta(51, 4500, "Fulano Silva", (byte)40);
        Conta contaInvestimento = new Conta(21, 500, "Ciclano Pereira", (byte)25);

        System.out.println("Saldo atual: " + contaCorrente.saldo);

        contaCorrente.depositar(200, 100);

        System.out.println("Saldo atual: " + contaCorrente.saldo);
    }
}
