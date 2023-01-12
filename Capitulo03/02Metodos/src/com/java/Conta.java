package com.java;

public class Conta {
    // variaveis de instancia
        // somente sao usadas ao instanciar um objeto
    int numero;
    double saldo;
    // variavel cliente de classe Cliente cria um novo objeto da classe
    Cliente cliente = new Cliente();

    public double recuperarSaldo() {
        return saldo;
    }


    // Sobrecarga de metodo, diferencia os dois metodos (de nomes iguais e ass e blocos diferentes) pelos parametros passados na execucao
    public void depositar(double valor) {
        saldo += valor;
    }

    public void depositar(double valor, double taxa) {
        saldo += valor - taxa;
    }
}
