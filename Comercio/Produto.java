package Comercio;

import java.util.ArrayList;
// import java.util.HashMap;

public class Produto {

    //static HashMap<String, Double> cardapio = new HashMap<String, Double>();
    static ArrayList<Produto> cardapio = new ArrayList<Produto>();
    private static int nextId = 101;

    private int prodId; 
    private String categoria;
    private String nome;
    private Double preco;
    private ArrayList<String> ingredientes;
    
    Produto (String n, Double p) {
        prodId = Produto.nextId;
        Produto.nextId++;
        nome = n;
        preco = p;
        cardapio.add(this);
    }

    public String toString() {
        return prodId + " - " + nome + "\t R$ " + preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    

    
}