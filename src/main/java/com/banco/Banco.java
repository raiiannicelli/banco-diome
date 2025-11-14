package com.banco;
import java.util.HashMap;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {   
        Cliente cliente = null;
        HashMap<Cliente, Conta> contas = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        boolean continua = true;

        do{
        System.out.println("Bem-vindo ao Banco!");
        System.out.println("1- Cadastrar cliente");
        System.out.println("2- Cadastrar conta");
        System.out.println("3- Listar contas");
        System.out.println("Escolha uma opção:");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Cadastro de cliente");
                System.out.println("Digite o nome do cliente;");
                String nome = scanner.next();
                System.out.println("Digite o CPF do cliente;");
                String cpf = scanner.next();
                System.out.println("Digite o ID do cliente;");
                int id = scanner.nextInt();
                cliente = new Cliente(nome, cpf, id);
                System.out.println(cliente.toString());
                break;
            case 2:
                System.out.println("Cadastro de conta banco");
                System.out.println("Informe o ID do cliente:");
                int ID = scanner.nextInt();
                if (cliente == null || cliente.getID() != ID) {
                    System.out.println("Cliente não encontrado. Cadastre o cliente primeiro.");
                    break;
                }
                System.out.println("Escolha o tipo de conta:");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                int tipoConta = scanner.nextInt();
                if (tipoConta == 1) {
                    Conta contaCorrente = new ContaCorrente(0);
                    contas.put(cliente, contaCorrente);
                break;
                } else if (tipoConta == 2) {
                    Conta contaPoupanca = new ContaPoupanca(0);
                    contas.put(cliente, contaPoupanca);
                break;
                } else {
                    System.out.println("Tipo de conta inválido!");
                }
                break;
            case 3:
                System.out.println("Listando contas cadastradas:");
                for (Cliente c : contas.keySet()) {
                    System.out.println("Cliente: " + c.toString());
                    contas.get(c).imprimirInfosComuns();
                    System.out.println(contas.get(c) instanceof ContaCorrente ? "Tipo de Conta: Conta Corrente" : "Tipo de Conta: Conta Poupança");
                    System.out.println("-------------------------");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }while(continua);
    scanner.close();
}
}
