package Restaurante;

import java.util.Scanner;
import java.util.ArrayList;


public class Cliente{
    private int clienteId;
    protected String nome;
    private String sobrenome;
    private String login;
    private String senha;
    ArrayList<Pedido> compras = new ArrayList<Pedido>();

    public Cliente(String u, String p) {
        login = u;
        senha = p;      
    }

    public static void registrar () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuário: ");
        String user = scanner.nextLine();
        
        System.out.print("Senha: ");
        String password = scanner.nextLine();
        

        new Cliente(user, password);
        
        
        System.out.println(user);
        System.out.println(password);
        
        

    }

    public void logar () {

    }


}