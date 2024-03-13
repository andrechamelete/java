//classe representa o cardápio, e seus objetos são os pratos

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {


    String nome;
    double preco;

    // class sabe quais pratos (objetos) existem e seus valores:
    Menu (String n, double p) {
        this.nome = n;
        this.preco = p;
        ArrayList<String> Ingredientes = new ArrayList<>();
        Restaurante.cardapio.put(this.nome, this.preco);

    }
}