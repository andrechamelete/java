// classe representa o pagamento do pedido
package Restaurante;

import java.util.Scanner;

public class Atendimento {

    public Atendimento() {}

    static void atender() {      

        System.out.println("Olá, bem vindo ao Restaurante! \nAqui está nosso cardápio. Posso anotar seu pedido?");
        System.out.println("1 - X-Burger");
        System.out.println("2 - X-Bacon");
        System.out.println("3 - X-Salada");
        
        oferecer();        
    }

    static void oferecer() {
        System.out.print("O que você deseja? (digite o número): ");
        Scanner opt = new Scanner(System.in);
        int input = opt.nextInt();

        switch (input) {
            case 1:
                System.out.println("Pedido: 1 X-Burger!");
                break;
            case 2:
                System.out.println("Pedido: 1 X-Bacon!");
                break;
            case 3:
                System.out.println("Pedido: 1 X-Salada!");
                break;
            default:
                System.out.println("Não é um pedido válido");
                oferecer();
                 
        }
        opt.close();    
    }
}