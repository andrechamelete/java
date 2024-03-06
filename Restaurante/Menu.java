//classe representa o cardápio, e seus objetos são os pratos

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    static HashMap<String, Double> cardapio = new HashMap<String, Double>();
    String nome;
    double preco;

    // class sabe quais pratos (objetos) existem e seus valores:
    Menu (String name, double precoV) {
        this.nome = name;
        this.preco = precoV;
        ArrayList<String> Ingredientes = new ArrayList<>();
        cardapio.put(this.nome, this.preco);

    }
}