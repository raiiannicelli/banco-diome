package com.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia) {
        super(agencia);

    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
