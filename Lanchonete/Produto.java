package Lanchonete;

import java.util.ArrayList;
import java.util.HashMap;

public class Produto {

    //static HashMap<String, Double> cardapio = new HashMap<String, Double>();
    static HashMap<Integer, Produto> cardapio = new HashMap<Integer, Produto>();
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
        cardapio.put(this.prodId, this);
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

    static void getCardapio (){
        for (Integer i : Produto.cardapio.keySet()) {
            System.out.println(Produto.cardapio.get(i));
        }
    }    
}