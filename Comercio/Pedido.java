package Comercio;

import java.util.HashMap;

public class Pedido {
    private static HashMap<Integer, Double> pedidos;

    private static int nextId = 1001;

    private int pedId;
    private Double total;
    private HashMap<String, Double> itens = new HashMap<String, Double>();
    private int userId;

    public Pedido () {

    }
}