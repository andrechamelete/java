package Comercio;

public class Principal {
    public static void main(String[] args) {
        Produto Xburger = new Produto("X-burger", 25.00);
        Produto Xbacon = new Produto("X-bacon", 28.00);
        Produto Xsalada = new Produto("X-salada", 27.00);

        Lanchonete.atender();
    } 
}