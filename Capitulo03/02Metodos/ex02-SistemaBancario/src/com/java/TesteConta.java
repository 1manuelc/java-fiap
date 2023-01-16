package com.java;

public class TesteConta {
    public static void main(String[] args) {
        Conta cc = new Conta(1089, 11, 3.87);
        Conta cp = new Conta(1089, 51, 5500);

        cp.verificarInfo();
        cp.retirar(2500);
        System.out.println(cp.verificarSaldo());

        cc.verificarInfo();
        cc.depositar(2500);
        System.out.println(cc.verificarSaldo());
    }
}
