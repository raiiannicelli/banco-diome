package com.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia) {
        super(agencia);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
