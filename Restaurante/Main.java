import java.util.HashMap;

public class Main {
    public static void main(String[]args) {

        Menu xburger = new Menu("X-burger", 25.00);
        Menu xbacon = new Menu("X-bacon", 28.00);
        Menu xsalad = new Menu("X-salada", 28.00);


        System.out.println(xburger.nome);
        System.out.println(xburger.preco);
        System.out.println(Restaurante.cardapio);
    }
}
