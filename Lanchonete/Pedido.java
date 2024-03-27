package Lanchonete;

import java.util.HashMap;

public class Pedido {
    private static HashMap<Integer, Double> pedidos = new HashMap<Integer, Double>();

    private static int nextId = 1001;

    private int pedId;
    private Double total;
    private Produto produto;
    private int userId;

    public Pedido (int p) {
        this.produto = Produto.cardapio.get(p);
        pedId = nextId;
        nextId++;
        Pedido.pedidos.put(this.pedId, this.total);
    }

    public String toString() {
        return pedId + "\t " + produto;
    }
}