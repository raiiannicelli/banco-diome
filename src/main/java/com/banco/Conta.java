package com.banco;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    private static int SEQUENCIA = 1;
    private static final int AGENCIA = 0001;

    public Conta(int agencia) {
        this.agencia = AGENCIA;
        this.numero = SEQUENCIA++;
        this.saldo = 0.0;
    }
    
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
        
    }
    @Override
    public void transferir(double valor, IConta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
} 
