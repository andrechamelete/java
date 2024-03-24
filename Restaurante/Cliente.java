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
        Scanner reg = new Scanner(System.in);
        System.out.print("Usuário: ");
        String user = reg.nextLine();
        System.out.print("Senha: ");
        String password = reg.nextLine();

        new Cliente(user, password);
        reg.close();
        
        System.out.println(user);
        System.out.println(password);


    }

    public void logar () {

    }


}