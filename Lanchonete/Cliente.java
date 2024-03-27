package Lanchonete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Cliente {
    private static HashMap<String, String> clientes = new HashMap<String, String>();

    private static int nextId = 1001;

    private int cliId;
    private String nome;
    private String senha;
    private boolean logado = false;
    
    public Cliente (String n, String s) {
        cliId = Cliente.nextId;
        nome = n;
        senha = s;
        logado = true;
        Cliente.nextId++;
        clientes.put(nome, senha);        
    }

    public static void registrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um nome de usuário: ");
        String user = scanner.nextLine();

        if (clientes.containsKey(user)) {
             System.out.println("Usuário já utilizado! Favor escolher outro nome de usuário");
            registrar();        
        }
        System.out.print("Escolha uma senha: ");
        String password = scanner.nextLine();
        Cliente userCliente = new Cliente(user, password); 
                
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuário: ");
        String user = scanner.nextLine();
        
        if (clientes.containsKey(user)) {
            System.out.print("Senha: ");
            String password = scanner.nextLine();
            if (!clientes.get(user).equals(password)) {
                System.out.println("Senha incorreta!");
                login();
            }
            // falta else{} para logar, pensar em como fazer isso!
        }
        
        else {
            System.out.println("Cliente não cadastrado.\nFavor realizar o cadastro:");
            Cliente.registrar();
        }
        
    }
}