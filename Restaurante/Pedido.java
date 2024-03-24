package Restaurante;

import java.util.HashMap;

public class Pedido {
    private int pedidoId;
    private HashMap<String, Double> itens = new HashMap<String, Double>();
    private Double Total;

    public void pedir(Menu m) {
        itens.put(m.getNome(), m.getPreco());
        Total = Total + m.getPreco();
    }

}