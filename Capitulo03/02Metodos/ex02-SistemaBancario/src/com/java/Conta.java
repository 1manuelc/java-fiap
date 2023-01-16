package com.java;

public class Conta {
    int agencia;
    int numero;
    double saldo;

    public Conta() {
    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public double verificarSaldo() {
        return this.saldo;
    }

    public void verificarInfo() {
        System.out.println("Informacoes de Conta:");
        System.out.println("Numero: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
    }
}
