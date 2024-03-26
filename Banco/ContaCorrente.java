package Banco;

import java.util.Scanner;



class ContaCorrente {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    ContaCorrente (String cname, String cid) {
        customerName = cname;
        customerId = cid;    
    }

    void deposit (int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw (int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Depositado: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("retirada de : " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("Nenhuma transação encontrada!");
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Extrato");
        System.out.println("B. Depositar");
        System.out.println("C. Sacar");
        System.out.println("D. Transação Anterior");
        System.out.println("E. Sair");

        do {
            System.out.println("=========================================");
            System.out.println("Escolha uma opção");
            System.out.println("=========================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("-----------------------------------------");
                    System.out.println("Saldo: " + balance);
                    System.out.println("-----------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("-----------------------------------------");
                    System.out.println("Digite um valor para depósito: ");
                    System.out.println("-----------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("-----------------------------------------");
                    System.out.println("Digite um valor para retirada: ");
                    System.out.println("-----------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("-----------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------");
                    System.out.println("\n");
                    break;
                
                case 'E':
                    System.out.println("*****************************************");
                    break;


                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }            
        }
        while (option != 'E');
        System.out.println("Obrigado por utilizar nossos serviços!");

        scanner.close();
    }
}