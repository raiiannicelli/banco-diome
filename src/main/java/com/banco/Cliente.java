package com.banco;

public class Cliente {
    private String nome;
    private String cpf;
    private int ID;
    
    public Cliente(String nome, String cpf, int ID) {
        this.nome = nome;
        this.cpf = cpf;
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Cliente" + '\n' +
                "nome=" + nome + '\n' +
                "cpf =" + cpf + '\n' +
                "ID  =" + ID + '\n';
    }
}
