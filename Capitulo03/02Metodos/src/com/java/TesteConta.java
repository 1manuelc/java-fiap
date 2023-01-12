package com.java;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Leandro Jorge";
        contaCorrente.cliente.idade = 36;

        contaPoupanca.numero = 51;
        contaPoupanca.saldo = 4500;
        contaPoupanca.cliente.nome = "Fulano Silva";
        contaPoupanca.cliente.idade = 40;

        contaInvestimento.numero = 21;
        contaInvestimento.saldo = 500;
        contaInvestimento.cliente.nome = "Ciclano Pereira";
        contaInvestimento.cliente.idade = 25;

        System.out.println("Saldo atual: " + contaCorrente.saldo);

        contaCorrente.depositar(200, 100);

        System.out.println("Saldo atual: " + contaCorrente.saldo);
    }
}
