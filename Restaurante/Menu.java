//classe representa o cardápio, e seus objetos são os pratos

package Restaurante;

import java.util.ArrayList;

public class Menu {

    private String nome;
    private Double preco;
    private ArrayList<String> ingredientes;

    // class sabe quais pratos (objetos) existem e seus valores:
    Menu (String n, Double p) {
        this.nome = n;
        this.preco = p;
        ArrayList<String> ingredientes = new ArrayList<>();
        Restaurante.cardapio.put(this.nome, this.preco);
    }

    //criação de lanche inicialmente para teste
    Menu xburger = new Menu("X-burger", 25.00);
    Menu xbacon = new Menu("X-bacon", 28.00);
    Menu xsalad = new Menu("X-salada", 28.00);  
}